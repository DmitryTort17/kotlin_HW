fun main(){
    seven()
    eight()
    nine()
    ten()
    eleven()


}
// Задание 7
 fun seven(){
    println("В каком году началась 2я мировая война?")
    var input1 = readLine()
    when (input1) {
        "1945" -> println ("Не верно")
        "1941" -> println ("Почти")
        "1939" -> println ("Абсолютно верно!")
        else -> println("Неа")
    }
    println("Какая настоящая фамилия Ленина?")
    var input2 = readLine()
    when (input2) {
        "Бродский" -> println ("Не верно")
        "Путин" -> println ("Почти")
        "Ульянов" -> println ("Абсолютно верно!")
        else -> println("Неа")
    }
    println("Первый массовый автомобиль Ford это")
    var input3 = readLine()
    when (input3) {
        "Granta" -> println ("Не верно")
        "Mustang" -> println ("Почти")
        "Ford Model T" -> println ("Абсолютно верно!")
        else -> println("Неа")
    }
    println("Кто был первым человеком в космосе?")
    var input4 = readLine()
    when (input4) {
        "Я" -> println ("Не верно")
        "Бил Клинтон" -> println ("Почти")
        "Юрий Гагарин" -> println ("Абсолютно верно!")
        else -> println("Неа")
    }
    println("Петра первого подменили когда он уехал в Европу?")
    var input5 = readLine()
    when (input5) {
        "Конечно" -> println ("Не верно")
        "Да подменили, но потом он подменился обратно" -> println ("Почти")
        "Нет" -> println ("Абсолютно верно!")
        else -> println("Неа")
    }
println("поздравляю, вы не безнадежны")
}
//Задание 8
fun eight (){
print("Введите сумму вклада: ")
 val sum: Int = readLine()?.toIntOrNull() ?: 0 // сумма вклада
print("введите процент: ")
 val n: Int = readLine()?.toIntOrNull() ?: 0// процент
print("введите кол-во месяцев: ")
 val mnt: Int = readLine()?.toIntOrNull() ?: 0 // кол-во месяцев
 var total_sum = sum.toDouble() //итоговая сумма
    var a: Double // переменная для хранения вычисленного процента
    for (i in 1..mnt){
        a = total_sum * n / 100
        total_sum += a
        println("Сумма увеличится на $a в этом месяце")
        println("Итоговая сумма после в текущем: $total_sum")
    }
    println("Итоговая сумма после $mnt месяцев: $total_sum")
}


//Задание 9
fun nine(){
    val BigArray = Array(3) { Array(3) { "" } }
    BigArray[0][0] = "Россия"
    BigArray[0][1] = "Китай"
    BigArray[0][2] = "Сша"
    BigArray[1][0] = "Москва"
    BigArray[1][1] = "Пекин"
    BigArray[1][2] = "Вашингтон"
    BigArray[2][0] = "Рубль"
    BigArray[2][1] = "Юань"
    BigArray[2][2] = "Доллар"
    print(BigArray)
    for (i in 0 until BigArray.size) {
        for (j in 0 until BigArray[i].size) {
            print("${BigArray[i][j]} ")
        }
        println()
    }
}
//Задание 10
fun ten(){
var CityList: MutableList<String> = mutableListOf("Киров", "Москва", "Лондон", "Вашингтон", "Казань", "Казань")
    print("Добавить город в список?")
    val input: String = readLine().toString()
    when (input) {
        "Да" -> {
            print("Введите название города: ")
            val newCity: String = readLine().toString() // добавляем город
            CityList.add(newCity)
            println(CityList)
        }
        "Выход" -> {
            println("Пока!")
            return
        }
        else -> {
            print("Ок, увидимся!!")
        }
    }
    print("Хотите посмотреть весь список?")
    val input2: String = readLine().toString()
    when (input2) {
        "Да" -> {
            println(CityList)
        }
        "Выход" -> {
            println("Пока")
            return
        }
        else -> {
            println("Штош")
        }
    }
    print("а хотите посмотреть список без дублей?")
    when (readLine().toString()) {
        "Да" -> {
            val withoutdouble = CityList.toSet()
            println(withoutdouble)
        }
        "Выход" -> {
            println("Увидимся!")
            return
        }
        else -> {
            println("Ну тогда заканчиваем")
        }
    }
}
//Зарадние 11
fun eleven() {
    val map = mutableMapOf<Int, String>() // Создаем пустую изменяемую Map
    // Добавляем элементы в map
    map[1] = "Иванов Иван Иванович"
    map[2] = "Петров Петр Петрович"
    map[3] = "Владимиров Владим Владимирович"
    println("Введите номер рабочего места: ")
    when (readLine().toString()) {
        "1" -> {
            print("это рабочее место занимает:  ${map[1]}")
        }
        "2" -> {
            print("это рабочее место занимает:  ${map[2]}")
        }
        "3" -> {
            print("это рабочее место занимает:  ${map[3]}")
        }
        else -> {
            println("Такого нет")
            return
        }
    }
}