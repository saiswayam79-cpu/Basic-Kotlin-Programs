fun main() {
    var number = 987654
    var count = 0
    if (number == 0) {
        count = 1
    } else {
        while (number != 0) {
            number /= 10
            count++
        }
    }
    println("Number of digits = $count")
}
