//Задание 1
fun First() {
    var any: Any? = null
    any = 2 // Переназначаем переменную any новым значением
    var new_one = any / 2.5
    print(new_one) // на выходе переменная типа bool
}
//Задание 2
fun Second() {
    var a = "hello"
    var b = "alpha"
    print("$a $b")
}
//Задание 3
fun Third() {
    var five: Char = '5'
    var ByteFive = five.toByte()
    var ShortFive = five.toShort()
    var IntFive = five.toInt()
    var DoubleFive = five.toDouble()
    var FloatFive = five.toFloat()
    var LongFive = five.toLong()
    var StringFive = five.toString()

    print(five)
    print(" | $ByteFive")
    print(" | $ShortFive")
    print(" | $IntFive")
    print(" | $LongFive")
    print(" | $FloatFive")
    print(" | $DoubleFive")
    print(" | $StringFive")
}

// 4 Задание
fun Four() {
    print("Введите ваше имя")
    var a: String? = readLine()
    print("Привет: $a")
}

// 5 Задание
fun Five() {
    val alphabet = 'Z' downTo 'A'
    val alphabetStr = alphabet.joinToString()
    print(alphabetStr)
}

// 6 Задание
fun Sixth() {
    print("Введите первое число: ")
    var input1 = readLine()
    var a = input1?.toInt()

    print("Введите второе число: ")
    var input2 = readLine()
    var b = input2?.toInt()
    var c = a!! > b!!
    print(c)

}

fun main(){
    First()
    Second()
    Third()
    Four()
    Five()
    Sixth()
}
