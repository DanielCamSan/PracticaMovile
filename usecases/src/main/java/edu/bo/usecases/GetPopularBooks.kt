package edu.bo.usecases
import app.bo.com.ucb.data.BooksRepository
import app.bo.com.ucb.domain.Books

class GetPopularBooks(val repository: BooksRepository) {
    suspend fun invoke(): List<Book> {
        return repository.getPopularBooks()
    }
}