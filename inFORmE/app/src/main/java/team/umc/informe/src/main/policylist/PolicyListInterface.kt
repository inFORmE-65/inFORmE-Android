package team.umc.informe.src.main.policylist

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import team.umc.informe.src.main.policylist.model.PolicyListResponse

interface PolicyListInterface {
    @GET("gov24/v1/serviceList")
    fun getPolicyList(
        @Query("page") page: Int,
        @Query("perPage") perPage: Int,
        @Query("returnType") returnType: String,
        @Query ("serviceKey") serviceKey: String
    ): Call<PolicyListResponse>
}