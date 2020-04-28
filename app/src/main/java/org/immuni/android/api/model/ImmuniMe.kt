package org.immuni.android.api.model

import com.bendingspoons.base.utils.JSonSerializable
import com.bendingspoons.oracle.api.model.OracleMe
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import org.immuni.android.models.survey.TriageProfileId

@JsonClass(generateAdapter = true)
class ImmuniMe(
    @field:Json(name = "server_triage") val serverTriageProfileId: TriageProfileId? = null
): OracleMe(), JSonSerializable
