package edu.xfolex.data.remote.api

import edu.xfolex.data.remote.dto.cast.CastMember
import edu.xfolex.data.remote.dto.crew.CrewMember
import edu.xfolex.data.remote.dto.episodes.Episode
import edu.xfolex.data.remote.dto.images.Image
import edu.xfolex.data.remote.dto.show.Show
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ShowApi {

    @GET("shows")
    fun getShowInfoBySingleSearch(@Query("q=") nameOfShow: String): Single<Show>

    @GET("shows")
    fun getShowInfoBySearch(@Query("q=") nameOfShow: String): Single<List<Show>>

    @GET("shows/{id}/cast")
    fun getCastOfTheShow(@Path("id") memberId: Int): Single<List<CastMember>>

    @GET("shows/{id}/crew")
    fun getCrewOfTheShow(@Path("id") memberId: Int): Single<List<CrewMember>>

    @GET("shows/{id}/episodes")
    fun getEpisodes(@Path("id") episodeId: Int): Single<List<Episode>>

    @GET("shows/{id}/images")
    fun getShowImages(@Path("id") id: Int): Single<List<Image>>

    companion object {
        const val BASE_URL = "https://api.tvmaze.com/"
    }
}