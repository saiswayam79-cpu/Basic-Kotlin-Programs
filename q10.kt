fun main() {
    val ch = 'A'
    val lowerChar = ch.lowercaseChar()
    if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' ||
        lowerChar == 'o' || lowerChar == 'u') {
        println("$ch is a Vowel")
    } else {
        println("$ch is a Consonant")
    }
}
