// Задание 17: Авиакомпания 1
class Aircraft(
        val aircraftNumber: String,
        val maxFlightRange: Int,
        val tankCapacity: Int,
        protected var _fuelConsumption: Int
) {
    val fuelConsumption: Int
        get() = (tankCapacity * 100) / maxFlightRange
}

// Задание 19: Авиакомпания 3
class Boing747(
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
        println("Aircraft: $aircraftNumber")
        println("Max Flight Range: $maxFlightRange")
        println("Tank Capacity: $tankCapacity")
        println("Fuel Consumption: $fuelConsumption")
        println("Passenger Capacity: $passengerCapacity")
    }
}