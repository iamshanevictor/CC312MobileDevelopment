fun main() {
    println(calculateBMI(40.5, 1.677)) // Example usage with weight in kilograms and height in meters
}

fun calculateBMI(weightKg: Double, heightM: Double): Double {
    if (weightKg <= 0.0 || heightM <= 0.0) {
        throw IllegalArgumentException("Weight and height must be positive values.")
    }

    val bmi = weightKg / (heightM * heightM)
    return bmi
}
