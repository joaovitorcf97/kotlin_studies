package funcoes

fun main() {
    helloWord2()
    println(sum2(10,10))
    println(divisao(10f, 2f))
}

fun helloWord2() = println("Hello World")

fun sum2(a: Int, b: Int) = a + b

fun divisao(a: Float, b: Float) = a / b
