package edu.bo.data

interface IRemoteDataSource {
    suspend fun getPopularBooks( apiKey: String): List<Book>
}