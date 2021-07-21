package com.example.yourdailynews.models

//https://newsapi.org/v2/top-headlines?country=ca&apiKey=0d0cce94937a4a8a9280e4363dde2bf3&format=json
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*


@JsonClass(generateAdapter = true)
data class NewsItem (
    var author: String,
    var title: String,
    var description: String
        )
