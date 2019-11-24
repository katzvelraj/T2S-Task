package com.sample.test.data.domain.model



data class GenericReqAndResp<T>(val data: T, val message: String, val success: Boolean)
