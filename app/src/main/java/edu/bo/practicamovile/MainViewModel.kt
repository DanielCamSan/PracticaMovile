package edu.bo.practicamovile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.launch
import java.sql.Date
//import app.bo.com.ucb.domain.Book
//import app.bo.com.ucb.usecases.GetPopularBook

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
class GetPopularBook(repository: MoviesRepository){
    fun invoke() : List<Book>
    {
        var listPublications = arrayListOf<Book>()
        return listPublications
    }
}

data class Book(val id:Int, val title:String, val Description:String, val  authors:String, val createdDate: Date, val category:String)
/*


class MainViewModel(private val popularMovies: GetPopularMovie) : ScopedViewModel() {
    init {
        initScope()
    }
    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel>
        get() = _model


    sealed class UiModel() {
        class Content(val movies: List<Movie>) : UiModel()
    }
    fun loadMovies() {
        launch {
            _model.value = UiModel.Content(popularMovies.invoke())
        }
    }
}


 */