package com.carvana.coroutinesandflows.retrofitWithCoroutinesAndFlows.networkLayer

import com.carvana.coroutinesandflows.retrofitWithCoroutinesAndFlows.models.BooksResponseModel
import retrofit2.http.GET

interface BooksService {
    @GET("books/currently-reading.json")
    suspend fun fetchCurrentlyReadingBooks(): BooksResponseModel
}