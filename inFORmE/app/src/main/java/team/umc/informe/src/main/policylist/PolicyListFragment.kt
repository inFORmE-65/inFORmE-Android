package team.umc.informe.src.main.policylist

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.FragmentActivity
import team.umc.informe.R
import team.umc.informe.config.BaseFragment
import team.umc.informe.databinding.FragmentListBinding
import team.umc.informe.src.main.policylist.model.PolicyListResponse
import team.umc.informe.util.policylist.PolicyListAdapter
import team.umc.informe.util.policylist.PolicyListData

class PolicyListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::bind, R.layout.fragment_list), PolicyListView {

    lateinit var policyListAdapter: PolicyListAdapter
    var policyListDatas = mutableListOf<PolicyListData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showLoadingDialog(requireContext())
        PolicyListService(this).tryGetPolicyList(1, 10, "JSON","4qdywegfVpdcSvD0uF1zrGAJ4VMzz9V/ybv/D6U0NsNY9OpKYNKE8IOqfgyj912iwCHDcmYoFlxNOlND07KsZA==")
    }


    override fun onGetPolicyListSuccess(response: PolicyListResponse) {
        dismissLoadingDialog()

        policyListAdapter = PolicyListAdapter(context as FragmentActivity?)
        binding.recyclerPolicyList.adapter = policyListAdapter

        for(i in response.data.indices){
            policyListDatas.apply {
                add(
                    PolicyListData(
                        name = response.data[i].서비스명,
                        hits = response.data[i].조회수,
                        context = response.data[i].지원내용,
                        subject = response.data[i].지원대상
                    )
                )
            }
        }

        policyListAdapter.policyListDatas = policyListDatas
        policyListAdapter.notifyDataSetChanged()
    }

    override fun onGetPolicyListFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast(message)
    }


}