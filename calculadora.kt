fun main() {
    val num1 = 10
    val num2 = 7
    var resultado: Int? = null

    resultado = suma(num1, num2)
    println("El resultado de la suma es: $resultado")

    resultado = resta(num1, num2)
    println("El resultado de la resta es: $resultado")

    resultado = multiplicacion(num1, num2)
    println("El resultado de la multiplicacion es: $resultado")

    println("El resultado de la division es: ${division(num1, num2)}")
}

fun suma(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun resta(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun multiplicacion(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun division(num1: Int, num2: Int): Double {
    val num1 = num1.toDouble()
    val num2 = num2.toDouble()
    return num1 / num2
}
