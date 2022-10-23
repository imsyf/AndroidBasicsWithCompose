package com.posebasics.app.toc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.EpoxyController
import com.posebasics.app.R
import com.posebasics.app.body
import com.posebasics.app.data.Store
import com.posebasics.app.databinding.EpoxyLayoutBinding
import com.posebasics.app.headline
import com.posebasics.app.pathwayItem

class PathwayFragment : Fragment() {

    private var _binding: EpoxyLayoutBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<PathwayFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = EpoxyLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val controller = object : EpoxyController() {
            override fun buildModels() {
                headline {
                    id("unitTitle")
                    text(args.unitTitle)
                    spanSizeOverride { totalSpanCount, _, _ -> totalSpanCount } // to fill entire row
                }
                body {
                    id("unitDescription")
                    text(args.unitDescription)
                    spanSizeOverride { totalSpanCount, _, _ -> totalSpanCount } // to fill entire row
                }
                Store.getPathwayProps(args.unitId).forEach {
                    pathwayItem {
                        id("pathway/${it.id}")
                        props(it)
                        onClick { _, _, _, _ ->
                            val directions = PathwayFragmentDirections.toDemoFragment(
                                screenTitle = buildString {
                                    append(args.screenTitle)
                                    append(" ")
                                    append(getString(R.string.pathway_id, it.id))
                                },
                                pathwayBadge = it.badge,
                                pathwayTitle = it.title,
                                pathwayDescription = it.description,
                            )
                            Store.setCurrentPathway(it.id)
                            findNavController().navigate(directions)
                        }
                    }
                }
            }
        }.apply {
            spanCount = 2
        }

        with(binding.epoxy) {
            layoutManager = GridLayoutManager(requireContext(), controller.spanCount).apply {
                spanSizeLookup = controller.spanSizeLookup
            }
            setControllerAndBuildModels(controller)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
