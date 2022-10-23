package com.posebasics.app.toc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.posebasics.app.R
import com.posebasics.app.data.Store
import com.posebasics.app.databinding.EpoxyLayoutBinding
import com.posebasics.app.unitItem

class CourseUnitFragment : Fragment() {

    private var _binding: EpoxyLayoutBinding? = null
    private val binding get() = _binding!!

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
            Store.courseUnitProps.forEach {
                unitItem {
                    id("unit/${it.id}")
                    props(it)
                    onClick { _, _, _, _ ->
                        val directions = CourseUnitFragmentDirections.toPathwayFragment(
                            unitId = it.id,
                            screenTitle = getString(R.string.unit_id, it.id),
                            unitTitle = it.title,
                            unitDescription = it.description,
                        )
                        Store.setCurrentCourseUnit(it.id)
                        findNavController().navigate(directions)
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
