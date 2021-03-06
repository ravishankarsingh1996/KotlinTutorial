package FunctionalProgramming


/** Code with ❤
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 27.02.2019 - 18:58          │
└─────────────────────────────┘
 */

data class Car(val name: String, val speed: Int)

fun main() {

    val cars = listOf(
        Car("Audi", 340),
        Car("BMW", 250),
        Car("Toyota", 290),
        Car("Mercedes", 270),
        Car("Renault", 180)
    )

    val selectedCar = cars.maxBy { car -> car.speed } // maxBy is higher-order func.

    println(selectedCar)
    println("brand: ${selectedCar?.name}")
    println("speed: ${selectedCar?.speed}")

    println("******* Another Example ********")

    //another example
    numberToString { number: Int, name: String ->
        println("Your id: $number \nYour name: $name")
    }

}

//another example
fun numberToString(higherOrderFunction: (number: Int, name: String) -> Unit) {

    println("Hello !")

    higherOrderFunction(1001, "OKAN")

    println("Welcome")

}
