package team.umc.informe.src.main.List

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import team.umc.informe.R
import team.umc.informe.config.BaseFragment
import team.umc.informe.databinding.FragmentListBinding
import team.umc.informe.util.policylist.PolicyListAdapter
import team.umc.informe.util.policylist.PolicyListData

class ListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::bind, R.layout.fragment_list) {

    lateinit var policyListAdapter: PolicyListAdapter
    var policyListDatas = mutableListOf<PolicyListData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        policyListAdapter = PolicyListAdapter(context as FragmentActivity?)
        binding.recyclerPolicyList.adapter = policyListAdapter

        for(i in 0..10){
            // test

            policyListDatas.apply {
                add(
                    PolicyListData(
                        name = "name",
                        hits = 3,
                        context = "context",
                        subject = "subject"
                    )
                )
            }
        }

        policyListAdapter.policyListDatas = policyListDatas
        policyListAdapter.notifyDataSetChanged()

    }



}