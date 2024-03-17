package proyectoMad.persistence.retrofit

import proyectoMad.persistence.retrofit.data.OverpassResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OverpassApiService {
    @GET("interpreter")
    fun fetchNearbyBars(
        @Query("data", encoded = true) data: String
    ): Call<OverpassResponse>
}