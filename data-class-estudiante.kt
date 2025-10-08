data class Direccion(
    val departamento: String,
    val municipio: String,
    val distrito: String,
    val complemento: String
)   

data class Estudiante(
    val nombre: String,
    val carnet: String,
    val edad: Int,
    val carrera: String,
    val direccion: Direccion
)

fun main() {
    val ListEstudent = listOf(
        Estudiante("Marcos", "00H1", 19, "Desarrollo de Software", Direccion("Paz Este", "La Paz", "Zacatecoluca", "Casa#4")),
        Estudiante("Carlos", "00H2", 20, "Desarrollo de Software", Direccion("San Salvador Norte", "San Salvador", "Mijicanos", "Casa#23")),
        Estudiante("Manuel", "00H3", 18, "Electronica", Direccion("Santa Ana", "Chalcuapa", "Barrio el Centro", "Casa#18"))
    )

    println(ListEstudent)

}
