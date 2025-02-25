package com.devzodiac.cryptotracer.crypto.domain

import com.devzodiac.cryptotracer.core.domain.util.NetworkError
import com.devzodiac.cryptotracer.core.domain.util.Result
import com.devzodiac.cryptotracer.crypto.domain.Coin
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}