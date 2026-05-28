fun largest(a: Int, b: Int, c: Int): Int {
    var max = a
    if (b > max) {
        max = b
    }
    if (c > max) {
        max = c
    }
    return max
}
fun main() {
    val num1 = 10
    val num2 = 25
    val num3 = 15
    val result = largest(num1, num2, num3)
    println("Largest = $result")
}
