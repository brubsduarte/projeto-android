package com.projeto.econonews.post

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.projeto.econonews.Home.Utilitarios.InfoUrl

import org.w3c.dom.Comment
import java.io.Serializable
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
class Post : Serializable {


    var desc: String? = null
    var id: String? = null
    var type: String? = null //NEWS
    var time: Int? = null
    var creationDate: Date? = null
    var fgLiked: Boolean = false
    var fgFavorite: Boolean = false
    var infoUrl: InfoUrl? = null
    var listTags: ArrayList<String>? = null


}