package edu.bo.data

interface ILocalDataSource {
    fun getPopularBooks(): List<Book>
}