package classes

class Goomba:
    Enemy("Goomba", 1) {
    override fun collision(collider: String) {
        super.collision(collider)
        when(collider){
            "Weapon" -> {
                var state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemy" -> changeDirection()
        }
        println("Usando la colisión de la clase Enemy")
    }

}
