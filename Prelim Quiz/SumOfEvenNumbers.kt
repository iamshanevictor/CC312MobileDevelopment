fun main() {
    println(sumOfEvenNumbers(4))
}

fun sumOfEvenNumbers(n: Int): Int {
    var sum = 0
    for (i in 2..n step 2) {
        sum += i 
    }
    return sum
}