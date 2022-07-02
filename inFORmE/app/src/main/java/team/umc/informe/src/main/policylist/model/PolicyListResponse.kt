package team.umc.informe.src.main.policylist.model

data class PolicyListResponse(
    val currentCount: Int,
    val `data`: List<Data>,
    val matchCount: Int,
    val page: Int,
    val perPage: Int,
    val totalCount: Int
)