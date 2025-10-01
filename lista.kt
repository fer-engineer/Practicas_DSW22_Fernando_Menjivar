/*
Crear una lista vacia que permita ingresar
Los numeros pares que se encuentran entre 1 y 100
debera de imprimir el tamaño de la lista
 */


fun main(){
    val list: MutableList<Int> = mutableListOf()

    for (i in 1..100){
        if(i % 2 == 0){ //Verificar si es par 
            list.add(i)
        
        }

    }
    

    println("Números pares: $list")

}