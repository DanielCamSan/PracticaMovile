package edu.bo.data

import edu.bo.domain.Book

interface ILocalDataSource {
    fun getPopularBooks(): List<Book>
}