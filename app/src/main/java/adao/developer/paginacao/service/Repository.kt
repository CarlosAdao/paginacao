package adao.developer.paginacao.service

import adao.developer.paginacao.entities.Data2
import adao.developer.paginacao.entities.Msg
import adao.developer.paginacao.entities.Res
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Service{

    @GET("characters?")
    suspend fun getDataFile(
            @Query("limit") lim: Int,
            @Query("offset") offset: Int,
            @Query("ts") ts: String,
            @Query("apikey") apikey: String,
            @Query("hash") hash: String
    ): Res

}

val retrofit = Retrofit.Builder()
    .baseUrl("https://gateway.marvel.com/v1/public/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val service: Service = retrofit.create(Service::class.java)

