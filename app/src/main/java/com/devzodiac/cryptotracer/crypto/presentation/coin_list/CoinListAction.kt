package com.devzodiac.cryptotracer.crypto.presentation.coin_list

import com.devzodiac.cryptotracer.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
//    data object OnRefresh: CoinListAction
}