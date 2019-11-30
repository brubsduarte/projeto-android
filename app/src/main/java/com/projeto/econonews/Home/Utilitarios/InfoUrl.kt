package com.projeto.econonews.Home.Utilitarios
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import kotlin.collections.ArrayList
import java.util.*


@JsonIgnoreProperties(ignoreUnknown = true)
class InfoUrl : Serializable {

    var url: String? = null
    var urlPhoto: String? = null
    var title: String? = null
    var desc: String? = null

}