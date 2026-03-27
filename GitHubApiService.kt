package com.example.githubstore

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubApiService {
    @GET("search/repositories")
    fun searchTrendingRepositories(
        @Query("q") query: String = "stars:>1",
        @Query("sort") sort: String = "stars",
        @Query("order") order: String = "desc"
    ): Call<TrendingRepositoriesResponse>
}

// Assume TrendingRepositoriesResponse is a data model for the response
