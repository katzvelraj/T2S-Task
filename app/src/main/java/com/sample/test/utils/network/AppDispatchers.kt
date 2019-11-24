package com.sample.test.utils.network

import kotlinx.coroutines.CoroutineDispatcher



class AppDispatchers(
    val main: CoroutineDispatcher,
    val io: CoroutineDispatcher
)
