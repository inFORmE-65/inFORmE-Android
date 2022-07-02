package team.umc.informe.src.main.policylist.model

data class Data(
    val 부서명: String?,
    val 상세조회URL: String?,
    val 서비스ID: String?,
    val 서비스명: String,
    val 서비스목적: String?,
    val 선정기준: String?,
    val 소관기관명: String?,
    val 소관기관코드: String?,
    val 신청기한: String?,
    val 신청방법: String,
    val 조회수: Int,
    val 지원내용: String,
    val 지원대상: String,
    val 지원유형: String?
)