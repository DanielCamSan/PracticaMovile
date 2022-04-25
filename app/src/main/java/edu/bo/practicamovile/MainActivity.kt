package edu.bo.practicamovile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import edu.bo.data.BooksRepository
import edu.bo.framework.BookDataSource
import edu.bo.framework.RetrofitBuilder


class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = MainViewModel(GetPopularBook(BooksRepository(BookDataSource( RetrofitBuilder), "fa3e844ce31744388e07fa47c7c5d8c3")))
        mainViewModel.model.observe(this, Observer(::updateUi))
        mainViewModel.loadMovies()
    }

    private fun updateUi(model: MainViewModel.UiModel?) {
        when ( model) {
            is MainViewModel.UiModel.Content -> showList(model.movies)
        }
    }

    fun showList(list: List<Book>) {
        for (i in list) {
            Toast.makeText(this, "El valor es"+ "i.title", Toast.LENGTH_LONG).show()
        }
        //recycler.adapter = MainAdapter(list)
    }
}
