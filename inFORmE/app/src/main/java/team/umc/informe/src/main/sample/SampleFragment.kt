package team.umc.informe.src.main.sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import team.umc.informe.R
import team.umc.informe.config.BaseFragment
import team.umc.informe.databinding.FragmentSampleBinding


class SampleFragment : BaseFragment<FragmentSampleBinding>(FragmentSampleBinding::bind, R.layout.fragment_sample){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}