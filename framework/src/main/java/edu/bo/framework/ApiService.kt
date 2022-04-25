package edu.bo.framework

import edu.bo.domain.Book
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("discover/book?short_by=popularity.desc")
    suspend fun listPopularBooks(@Query("api_key") apiKey: String) : BookResponse

}

class BookResponse(val page: Int, val results: List<Book>)