package com.posebasics.app.toc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.posebasics.app.data.Store
import com.posebasics.app.databinding.EpoxyLayoutBinding
import com.posebasics.app.demoHeader
import com.posebasics.app.demoItem

class DemoFragment : Fragment() {

    private var _binding: EpoxyLayoutBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<DemoFragmentArgs>()

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

        binding.epoxy.withModels {
            demoHeader {
                id("header")
                badge(args.pathwayBadge)
                title(args.pathwayTitle)
                description(args.pathwayDescription)
            }
            Store.currentPathway.demos.forEachIndexed { index, demo ->
                if (demo.route != null) {
                    demoItem {
                        id("demo/$index")
                        props(demo)
                        onClick { _, _, _, _ ->
                            findNavController().navigate(demo.route)
                        }
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
