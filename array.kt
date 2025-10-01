// Guardar un arreglo 5 notas de estudiantes
// asignarle valores a cada elemento del
// arreglo y por ultimo calcular el promedio
// de las notas e imprimirlo


fun main () {
    val notas = arrayOf(5.0, 9.0 , 5.0 , 7.0 , 10.0)

    var suma = 0.0 
    var promedio = 0.0

    println("Las notas son:")
    for (i in notas!!.indices){
        println(notas[i])
        suma = suma  + notas[i]!!
    }


    println("El promedio es:")
    promedio = suma/5
    println(promedio)
}