fun convertCurrency(amount: Double, exchangeRate: Double): Double {
    if (amount < 0.0 || exchangeRate <= 0.0) {
        throw IllegalArgumentException("Amount and exchange rate must be positive values.")
    }

    val convertedAmount = amount * exchangeRate
    return convertedAmount
}

fun main() {
    val amountInUSD = 100.0
    val exchangeRateUSDToEUR = 0.85 

    try {
        val amountInEUR = convertCurrency(amountInUSD, exchangeRateUSDToEUR)
        println("Converted amount: $amountInUSD USD = $amountInEUR EUR")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
