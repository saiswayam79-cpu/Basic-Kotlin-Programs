fun main() {
    var number = 121
    var temp = number
    var reverse = 0
    while (temp != 0) {
        val digit = temp % 10
        reverse = reverse * 10 + digit
        temp /= 10
    }
    if (number == reverse) {
        println("$number is Palindrome")
    } else {
        println("$number is Not Palindrome")
    }
}
