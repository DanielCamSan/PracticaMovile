package edu.bo.data

class BooksRepository (
    val remoteDataSource: IRemoteDataSource, val apiKey: String) {
        suspend fun getPopularBooks()  = remoteDataSource.getPopularBooks(apiKey)
    }