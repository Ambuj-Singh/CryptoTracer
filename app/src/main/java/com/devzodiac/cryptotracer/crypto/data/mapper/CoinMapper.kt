import com.devzodiac.cryptotracer.crypto.data.networking.dto.CoinDto
import com.devzodiac.cryptotracer.crypto.data.networking.dto.CoinPriceDto
import com.devzodiac.cryptotracer.crypto.domain.Coin
import com.devzodiac.cryptotracer.crypto.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr ?: 0.0
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {

    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.systemDefault())
    )
}