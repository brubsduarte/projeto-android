package com.projeto.econonews.post

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

import org.w3c.dom.Comment
import java.io.Serializable
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
class PostSearch : Serializable {

//
//    var idUser: String? = null // user logged
//    var idUserCreator: String? = null // user creator of post
//    var idGroup: String? = null
    var lat: Double? = null
    var log: Double? = null
    var queryString: String? = null
    var page: Int = 0


}