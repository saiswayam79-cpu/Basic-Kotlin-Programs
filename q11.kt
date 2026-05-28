fun main() {
    var number = 1234
    var sum = 0
    if (number == 0) {
        sum = 0
    } else {
        while (number != 0) {
            sum += number % 10
            number /= 10
        }
    }
    println("Sum of digits = $sum")
}
