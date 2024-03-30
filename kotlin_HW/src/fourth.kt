// Задание 17: Авиакомпания 1
open class Aircraft(
        val aircraftNumber: String,
        val maxFlightRange: Int,
        val tankCapacity: Int,
        protected var _fuelConsumption: Int
) {
    open val fuelConsumption: Int
        get() = (tankCapacity * 100) / maxFlightRange
}

// Задание 18: Авиакомпания 2
class Aircraft1(
        val aircraftNumber: String,
        val maxFlightRange: Int,
        val tankCapacity: Int,
        private var _fuelConsumption: Int
) {
    val fuelConsumption: Int
        get() = (tankCapacity * 100) / maxFlightRange

    constructor(aircraftNumber: String, maxFlightRange: Int, tankCapacity: Int)
            : this(aircraftNumber, maxFlightRange, tankCapacity, 20)
}

// Задание 19: Авиакомпания 3
class Boing747A(
        aircraftNumber: String,
        maxFlightRange: Int,
        tankCapacity: Int,
        val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, tankCapacity, 20)

// Задание 20: Авиакомпания 4
interface Passenger {
    val passengerCapacity: Int
}

class Boing747(
        aircraftNumber: String,
        maxFlightRange: Int,
        tankCapacity: Int,
        override val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, tankCapacity, 20), Passenger {

    override val fuelConsumption: Int
        get() = (tankCapacity * 100) / maxFlightRange

    fun displayInfo() {
        println("Авиасудно: $aircraftNumber")
        println("Максимальная Дальность Полета: $maxFlightRange")
        println("Вместимость Бака: $tankCapacity")
        println("Расход Топлива: $fuelConsumption")
        println("Вместимость Пассажиров: $passengerCapacity")
    }
    }
// Задание 22: Авиакомпания 6
abstract class AbstractAircraft(
        val aircraftNumber: String,
        val maxFlightRange: Int,
        val tankCapacity: Int,
        private var _fuelConsumption: Int
) {
    abstract val fuelConsumption: Int

    open fun displayInfo() {
        println("Aircraft: $aircraftNumber")
        println("Max Flight Range: $maxFlightRange")
        println("Tank Capacity: $tankCapacity")
        println("Fuel Consumption: $fuelConsumption")
    }
}

// Задание 23
data class Car(val brand: String, val color: String, val number: String)

fun main() {
    // Задание 17: Создание и вывод информации о самолете
    val aircraft = Aircraft("ABC123", 2000, 300, 20)
    println("Задание 17: Создание и вывод информации о самолете")
    println("Номер Самолета: ${aircraft.aircraftNumber}")
    println("Максимальная Дальность Полета: ${aircraft.maxFlightRange}")
    println("Вместимость Бака: ${aircraft.tankCapacity}")
    println("Расход Топлива: ${aircraft.fuelConsumption}")

    // Задание 18: Создание и вывод информации о самолете через Aircraft1
    val aircraft1 = Aircraft1("XYZ789", 3000, 400)
    println("\nЗадание 18: Создание и вывод информации о самолете через Aircraft1")
    println("Номер Самолета: ${aircraft1.aircraftNumber}")
    println("Максимальная Дальность Полета: ${aircraft1.maxFlightRange}")
    println("Вместимость Бака: ${aircraft1.tankCapacity}")
    println("Расход Топлива: ${aircraft1.fuelConsumption}")

    // Задание 19: Создание и вывод информации о Boeing747A
    val boing747B = Boing747A("XYZ789", 5000, 500, 300)
    println("\nЗадание 19: Создание и вывод информации о Boeing747A")
    println("Авиасудно: ${boing747B.aircraftNumber}")
    println("Максимальная Дальность Полета: ${boing747B.maxFlightRange}")
    println("Вместимость Бака: ${boing747B.tankCapacity}")
    println("Расход Топлива: ${boing747B.fuelConsumption}")
    println("Вместимость Пассажиров: ${boing747B.passengerCapacity}")

    // Задание 20: Создание и вывод информации о Boing747
    val boing747 = Boing747("DEF456", 6000, 600, 400)
    println("\nЗадание 20: Создание и вывод информации о Boing747")
    boing747.displayInfo()

    // Задание 22: Создание и вывод информации о Boing747 с использованием AbstractAircraft
    val abstractBoing747 = Boing747("GHI789", 7000, 700, 500)
    println("\nЗадание 22: Создание и вывод информации о Boing747 с использованием AbstractAircraft")
    abstractBoing747.displayInfo()

    // Задание 23: Создание и вывод информации об автомобиле
    val car = Car("Toyota", "Red", "ABC123")
    println("\nЗадание 23: Создание и вывод информации об автомобиле")
    println("Бренд: ${car.brand}")
    println("Цвет: ${car.color}")
    println("Номер: ${car.number}")
}
