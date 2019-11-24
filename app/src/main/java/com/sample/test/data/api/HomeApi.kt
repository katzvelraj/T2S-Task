package com.sample.test.data.api

import com.sample.test.data.domain.model.GenericReqAndResp
import retrofit2.http.GET


interface HomeApi {
    @GET("consumer/menu/options")
    suspend fun fetchData(): GenericReqAndResp<List<String>>
}
