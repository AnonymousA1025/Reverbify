package com.maxrave.simpmusic.data.model.browse.playlist


import com.google.gson.annotations.SerializedName

data class ArtistPlaylist(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)