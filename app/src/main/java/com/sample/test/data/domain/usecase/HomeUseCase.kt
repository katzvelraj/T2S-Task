package com.sample.test.data.domain.usecase

import com.sample.test.data.repo.HomeRepository



class HomeUseCase(private val repo: HomeRepository) {
    suspend fun getData() = repo.loadData()
}
