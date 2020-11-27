package adao.developer.paginacao.ui

import adao.developer.paginacao.entities.Res
import adao.developer.paginacao.service.Service
import adao.developer.paginacao.service.service
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(service: Service):ViewModel() {

    val listData = MutableLiveData<List<Res>>()

    fun getData(){
        viewModelScope.launch {
            try{
                Log.i("Retorono", service.getDataFile(
                        "1",
                        "6eb7e8896ec5850c52515a8a23ee97f0",
                        "40a3aa568bb269dfad85ae0c4a297181"
                ).toString())
            }catch (e: Exception){
                Log.i("MainViewModel", e.toString())
            }
        }
    }

}