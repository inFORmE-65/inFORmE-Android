package team.umc.informe.src.main.policylist

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import team.umc.informe.config.ApplicationClass
import team.umc.informe.src.main.policylist.model.PolicyListResponse
import team.umc.informe.util.policylist.PolicyListData

class PolicyListService(val policyListView: PolicyListView) {
    fun tryGetPolicyList(page: Int, perPage: Int, returnType: String,serviceKey: String){
        val policyListInterface = ApplicationClass.sRetrofit.create(PolicyListInterface::class.java)
        policyListInterface.getPolicyList(page, perPage, returnType,serviceKey).enqueue(object: Callback<PolicyListResponse> {
            override fun onResponse(
                call: Call<PolicyListResponse>,
                response: Response<PolicyListResponse>
            ) {
                policyListView.onGetPolicyListSuccess(response.body() as PolicyListResponse)
            }

            override fun onFailure(call: Call<PolicyListResponse>, t: Throwable) {
                policyListView.onGetPolicyListFailure(t.message ?: "통신 오류")
            }

        })
    }
}