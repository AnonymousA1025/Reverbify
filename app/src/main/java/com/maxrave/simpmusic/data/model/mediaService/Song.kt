package com.maxrave.simpmusic.data.model.mediaService

import android.graphics.Bitmap
import androidx.media3.common.MediaItem
import com.maxrave.simpmusic.data.model.searchResult.songs.Album
import com.maxrave.simpmusic.data.model.searchResult.songs.Artist
import com.maxrave.simpmusic.data.model.searchResult.songs.Thumbnail

data class Song (
    val title: String?,
    val artists: List<Artist>?,
    val mediaItem: MediaItem,
    val duration: Long,
    val lyrics: Any,
    val album: Album,
    val videoId: String,
    val thumbnail: Thumbnail?,
    val thumbnailBitmap: Bitmap?,
    val isLocal: Boolean
)