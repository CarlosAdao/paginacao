package adao.developer.paginacao.ui
//https://gateway.marvel.com/v1/public/characters

//Gerador md5
//https://www.md5hashgenerator.com/

//Documentoação
//https://developer.marvel.com/documentation/authorization

//Como pegar as imagens
//http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784.jpg

//url com chave
//https://gateway.marvel.com/v1/public/characters?ts=1&apikey=6eb7e8896ec5850c52515a8a23ee97f0&hash=40a3aa568bb269dfad85ae0c4a297181

//Gerando time stamp
//Math.floor(Date.now()/ 1000)

import adao.developer.paginacao.R
import adao.developer.paginacao.service.service
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    val viewModel by viewModels<MainViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(service) as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getData()

        viewModel.listData.observe(this){

                Log.i("MainActivity", it.size.toString())

        }
    }
}