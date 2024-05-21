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

// Интерфейс для грузовых самолетов
interface Cargo {
    val cargoCapacity: Int
}

// Класс для грузового самолета
class CargoPlane(
        aircraftNumber: String,
        maxFlightRange: Int,
        tankCapacity: Int,
        override val cargoCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, tankCapacity, 30), Cargo {

    override val fuelConsumption: Int
        get() = (tankCapacity * 100) / maxFlightRange

    fun displayCargoInfo() {
        println("Авиасудно: $aircraftNumber")
        println("Максимальная Дальность Полета: $maxFlightRange")
        println("Вместимость Бака: $tankCapacity")
        println("Расход Топлива: $fuelConsumption")
        println("Грузоподъемность: $cargoCapacity")
    }
}

// Класс для другого пассажирского самолета
class AirbusA320(
        aircraftNumber: String,
        maxFlightRange: Int,
        tankCapacity: Int,
        val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, tankCapacity, 25) {

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

fun main() {
    // Создание и вывод информации о самолете
    val aircraft = Aircraft("ABC123", 2000, 300, 20)
    val aircraft1 = Aircraft1("XYZ789", 3000, 400)
    val boing747B = Boing747A("XYZ789", 5000, 500, 300)
    val boing747 = Boing747("DEF456", 6000, 600, 400)
    val cargoPlane = CargoPlane("CARGO1", 7000, 800, 10000)
    val airbusA320 = AirbusA320("AIRBUS320", 4000, 500, 180)

    // Коллекция самолетов
    val aircraftCollection = mutableListOf<Aircraft>()
    aircraftCollection.add(aircraft)
    aircraftCollection.add(boing747B)
    aircraftCollection.add(boing747)
    aircraftCollection.add(cargoPlane)
    aircraftCollection.add(airbusA320)

    // Пользовательский интерфейс
    while (true) {
        println("\nВведите номер команды:")
        println("1. Показать все самолеты")
        println("2. Показать информацию о конкретном самолете")
        println("3. Выйти")

        when (readLine()) {
            "1" -> {
                println("Список всех самолетов:")
                for ((index, plane) in aircraftCollection.withIndex()) {
                    println("${index + 1}. ${plane.aircraftNumber}")
                }
            }
            "2" -> {
                println("Введите номер самолета:")
                val index = readLine()?.toIntOrNull()
                if (index != null && index in 1..aircraftCollection.size) {
                    val plane = aircraftCollection[index - 1]
                    when (plane) {
                        is Boing747 -> plane.displayInfo()
                        is CargoPlane -> plane.displayCargoInfo()
                        is AirbusA320 -> plane.displayInfo()
                        else -> {
                            println("Авиасудно: ${plane.aircraftNumber}")
                            println("Максимальная Дальность Полета: ${plane.maxFlightRange}")
                            println("Вместимость Бака: ${plane.tankCapacity}")
                            println("Расход Топлива: ${plane.fuelConsumption}")
                        }
                    }
                } else {
                    println("Неверный номер самолета")
                }
            }
            "3" -> return
            else -> println("Неверная команда")
        }
    }
}