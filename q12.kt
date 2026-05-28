fun main() {
    var a = 10
    var b = 20
    var temp = a
    a = b
    b = temp
    println("Using third variable:")
    println("a = $a, b = $b")
    var x = 5
    var y = 15
    x = x + y
    y = x - y
    x = x - y
    println("Without third variable:")
    println("x = $x, y = $y")
}
