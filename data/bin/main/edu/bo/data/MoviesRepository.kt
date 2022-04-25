package edu.bo.data

class MoviesRepository (
    val remoteDataSource: IRemoteDataSource, val apiKey: String) {
        suspend fun getPopularBooks()  = remoteDataSource.getPopularBooks(apiKey)
    }