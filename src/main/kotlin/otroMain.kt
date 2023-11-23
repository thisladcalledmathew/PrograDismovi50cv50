import classes.Goomba
import classes.Koopa
import classes.mario
import classes.Enemy
import classes.Vehiculos
/*fun main(){
        //Clase Vehiculo
        val miVehiculo = Vehiculos("Ford","2020","Verde")
        miVehiculo.placas = "NNT3047"
        println("El coche está encendido? ${miVehiculo.encendido}")
        miVehiculo.encender()
        println("El coche encendio? ${miVehiculo.encendido}")
        println("El tanque tiene ${miVehiculo.gasolina}")
        miVehiculo.recargar(20.07f)
        println("El tanque ahora tiene ${miVehiculo.gasolina}")
        val golNegro = Vehiculos("Volkswagen", "Gol")

        val sonicAzul = Vehiculos(
                marca = "Ford",
                modelo = "Sonic",
                color = "Azul",
                placas = "ALS9763"
        )
        println(golNegro)
        println(sonicAzul)
    }*/

fun main(){
    var mario = mario()
    for (i in 1..5){
            if(mario.isAlive){
                    mario.collision("Goomba")
                    println("Te quedan ${mario.getLives()}")
            }
            println("Te quedan ${mario.getLives()}")
    }
    mario.collision("star")
    val Enemy = Enemy("Un enemigo",2)
    Enemy.collision("Enemy")
    Enemy.collision("Weapon")
    val enemy = Goomba()
    enemy.collision("Enemy")
    enemy.collision("Weapon")
    val koopa = Koopa()
    koopa.collision("Weapon")
}