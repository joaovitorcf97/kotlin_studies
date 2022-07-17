package funcoes

fun main() {
    var str = "Programação Kotlin."

    println("Tamanho da string: ${str.length}")
    println("Posição (index) 0 da string: ${str[0]}")
    println(str.startsWith("Pro", false))
    println(str.endsWith("abc"))
    println(str.substring(2, 4))
    println(str.replace("Kotlin", "Dart"))
    println(str.lowercase())
    println(str.uppercase())
    println(str.trim())
}