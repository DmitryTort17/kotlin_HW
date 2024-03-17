import kotlin.math.sqrt

// Является ли год високосным
fun twelve(){
    println("Введите год")
    val year = readlnOrNull()?.toInt()
    if (year != null) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            println("Високосный год")
        } else {
                println("Не високосный год")
            }
    } else {
        println("Не введен год")
    }
}

// Количество сотрудников
fun thirteen(vararg names: String) {
    println("Введите имена сотрудников. Для завершения введите 'exit'")
    var count = 0
    while (true) {
        val employees = readlnOrNull()
        if (employees == "exit") {
            break
        } else {
            count++
            println("Добавлен сотрудник: $employees")
        }
    }
    return (println("Количество сотрудников: $count"))
}

//Инфо сотрудника, перегрузка метода
fun fourteen(name: String, position: String) {
    return println("$name $position")
}
fun fourteen(name: String, age: Int, position: String) {
    return println("$name $age $position")
}
fun fourteen(name: String, maritalStatus: String, position: String) {
    return println("$name $maritalStatus $position")
}
fun fourteen(name: String, age: Int, maritalStatus: String, position: String) {
    return println("$name $age $maritalStatus $position")
}

// Лямда
val fifteen ={array: Array<String> -> println(array.joinToString(", "))}
val names = arrayOf("Даша", "Паша", "Гриша", "Женя")

//Корень числа
fun sixteen(){
    val number = readln().toDouble()
    val squareRootNumber = sqrt(number)
    println("Квадратный корень из $number равен $squareRootNumber")
}

fun main() {
    twelve()
    thirteen()
    fourteen(name = "Петров Петр Петрович", maritalStatus = "Женат", age = 222,  position = "Базированный") // Сюда передаем 2-4 значения
    fifteen(names)
    sixteen()
}