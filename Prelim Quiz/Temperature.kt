fun convertTemperature(
    value: Double,
    fromUnit: String,
    toUnit: String
): Double {
    if (value < -273.15 && (fromUnit == "Celsius" || fromUnit == "Kelvin")) {
        throw IllegalArgumentException("Temperature cannot be below absolute zero.")
    }

    return when (fromUnit) {
        "Fahrenheit" -> {
            when (toUnit) {
                "Celsius" -> (value - 32) * 5 / 9
                "Kelvin" -> (value - 32) * 5 / 9 + 273.15
                else -> throw IllegalArgumentException("Invalid 'toUnit' parameter.")
            }
        }
        "Celsius" -> {
            when (toUnit) {
                "Fahrenheit" -> (value * 9 / 5) + 32
                "Kelvin" -> value + 273.15
                else -> throw IllegalArgumentException("Invalid 'toUnit' parameter.")
            }
        }
        "Kelvin" -> {
            when (toUnit) {
                "Fahrenheit" -> (value - 273.15) * 9 / 5 + 32
                "Celsius" -> value - 273.15
                else -> throw IllegalArgumentException("Invalid 'toUnit' parameter.")
            }
        }
        else -> throw IllegalArgumentException("Invalid 'fromUnit' parameter.")
    }
}

fun main() {
    val temperature = 32.0
    val fromUnit = "Fahrenheit"
    val toUnit = "Celsius"

    try {
        val convertedTemperature = convertTemperature(temperature, fromUnit, toUnit)
        println("$temperature $fromUnit is $convertedTemperature $toUnit")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
