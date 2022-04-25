package edu.bo.data

import edu.bo.domain.Book

interface IRemoteDataSource {
    suspend fun getPopularBooks( apiKey: String): List<Book>
}