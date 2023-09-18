class Pendiente(var Y1: Double, var Y2: Double,var X1: Double, var X2: Double){
 var pendiente = (Y2-Y1)/(X2-X1)
}
fun main(args: Array<String>) {
    val pendiente = Pendiente(3.0,-2.0, 4.0, -3.0)

    println("la pendiente es ${pendiente.pendiente}")
}