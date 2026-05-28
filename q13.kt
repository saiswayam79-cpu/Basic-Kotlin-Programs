fun si(p: Double, r: Double, t: Double): Double {
    return (p * r * t) / 100
}
fun main() {
    val p = 1000.0
    val r = 5.0
    val t = 2.0

    val result = si(p, r, t)

    println("Simple Interest = $result")
}
