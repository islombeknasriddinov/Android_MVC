package com.example.android_mvc.network.service

import com.example.android_mvc.model.Post
import com.example.android_mvc.model.PostResp
import retrofit2.Call
import retrofit2.http.*

interface PostService {

    @Headers(
        "Content-type:application/json"
    )

    @GET("posts")
    fun listPost(): Call<ArrayList<Post>>

    @DELETE("posts/{id}")
    fun deletePost(@Path("id") id: Int): Call<Post>

    @POST("posts/{id}")
    fun createPost(@Body employee: Post): Call<Post>

    @PUT("posts/{id}")
    fun updatePost(@Body employee: Post): Call<Post>

}