package adao.developer.paginacao.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Msg (@SerializedName("results") @Expose val listData: List<Data>)
