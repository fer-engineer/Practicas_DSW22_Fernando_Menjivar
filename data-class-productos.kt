data class Producto(
    val id: String,
    val nombre: String,
    val precio: Double,
    val descripcion: String,
    val marca: String,
    val color: String,
    val stock: Int,
    val promocion: Boolean

)

fun main(){

    val ListProducts = listOf(
        Producto("HR23","Monitor", 168.9,"monitor de alta calidad","Lenovo","Gris", 20, false),
        Producto("HR24", "Teclado",23.56,"teclado mecanico","NVIDIA", "Blanco",10,false ),
        Producto("HR25", "Mouse", 27.69,"mouse gamer","Hp", "Negro", 4, true ),
    

    )
    println(ListProducts)
}