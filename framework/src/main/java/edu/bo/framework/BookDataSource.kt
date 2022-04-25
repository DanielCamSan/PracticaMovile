package edu.bo.framework

import app.edu.bo.data.IRemoteDataSource
import app.edu.bo.domain.Book
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.withContext

class BookDataSource(val api: RetrofitBuilder) : IRemoteDataSource {
    override suspend fun getPopularBooks(apiKey: String): List<Book> {
        return api.apiService.listPopularBooks(apiKey)
            .results.map {
                it.toDomainBook()
            }
    }
}