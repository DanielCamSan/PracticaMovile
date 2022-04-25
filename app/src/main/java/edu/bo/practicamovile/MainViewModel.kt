package edu.bo.practicamovile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import edu.bo.data.BooksRepository
import edu.bo.domain.Book
import kotlinx.coroutines.launch
import java.sql.Date


class MainViewModel(private val popularBooks: GetPopularBook) : ScopedViewModel() {
    init {
        initScope()
    }
    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel>
        get() = _model


    sealed class UiModel() {
        class Content(val movies: List<Book>) : UiModel()
    }
    fun loadMovies() {
        launch {
            _model.value = UiModel.Content(popularBooks.invoke())
        }
    }
}
class GetPopularBook(repository: BooksRepository){
    fun invoke() : List<Book>
    {
        var listPublications = arrayListOf<Book>()
        return listPublications
    }
}

