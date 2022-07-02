package team.umc.informe.src.main.policylist

import team.umc.informe.src.main.policylist.model.PolicyListResponse

interface PolicyListView {
    fun onGetPolicyListSuccess(response: PolicyListResponse)

    fun onGetPolicyListFailure(message: String)
}