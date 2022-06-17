package com.example.android_mvc.model

import com.google.gson.annotations.SerializedName

data class PostResp(
    @SerializedName("id")
    var id: Int,
    @SerializedName("userId")
    var userId: Int,
    @SerializedName("title")
    var title: String,
    @SerializedName("body")
    var body: String

    )