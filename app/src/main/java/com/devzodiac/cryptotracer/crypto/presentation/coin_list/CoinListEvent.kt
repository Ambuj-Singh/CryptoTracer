package com.devzodiac.cryptotracer.crypto.presentation.coin_list

import com.devzodiac.cryptotracer.core.domain.util.NetworkError
import org.koin.core.logger.MESSAGE

//one time events
sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}