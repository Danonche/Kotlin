//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Основная функция, точка входа в программу
fun main() {
    var myAge: Int = 32 // примерно 25 млрд
    var myShort: Short = 25 // короче в 2 раза чем Int
    var myLong: Long = 57 // Длиннее чем Int в 2 раза


    var myName: String = "Daniil" // Строкоый тип, указыватеся ""
    var myChar: Char = '?' // хранит один символ //
    var myFloat: Float = 2.44444f //тип с плавающей точкой. на конце f
    var myDouble: Double = 2.444449894894849
    var myBoolean: Boolean = true


    val myVel: Int =
        1000   // val нельзя перезаписывать, тоесть после объявления такой переменной нельзя сделать myVal = 2000

    var myNull: Int? = null // может хранить пустое значение, после типа ставим "?"


    println(myAge) // стандртный вывод
    println(myName)
    println(myChar)

    /* функция println содержит в себе перенос строки,
     тоесть вывод в консоли будет всегда с новой строки */


    //Математические операции:


    println(2 * 78)  // можно и так, но лучше использовать переменные как ниже

    var a = 10 /*тут мы сразу присвоили значение переменной,
     и тип (int) переменной был назначен втоматически*/
    var b = 3
    var c = a % b




    println(c)
    println(b + c)

    //Сравнение
    println(a > b)  // тут мы получи на выходе true
    println(a < b) // тут мы получи на выходе false
    println(a <= b)
    println(a >= b)
    println(a == b)
    println(a != b)

    // циклы

    var age = 34

    if (age > 29) {
        if (age > 75) {
            println("Вы слишком старый")
        } else {
            println("Hello, Вам больше 30 лет")
        }
    } else if (age > 17) {
        println("Hello, Вам больше 18 лет")
    } else {
        println("Вы не совершеннолетний")
    }


// условие можно объединить, используя &&
// в условии можно использовать оператор "или" ||

// Рассмотрим условие when, его используем когда(негласное правило) есть выбор из более чем 5 вариантов
    var dayOfWeek = "Пятниц"
    when (dayOfWeek){
        "Понедельник" -> println("Сегодня Понедельник")
        "Вторник" -> println("Сегодня Вторник")
        "Среда" -> println("Сегодня Среда")
        "Четверг" -> println("Сегодня Четверг")
        "Пятница" -> println("Сегодня Пятница")
        "Суббота"-> println("Сегодня Суббота")
        "Воскресенье"-> println("Сегодня Воскресенье")
        else -> println("Такого дня нет")

        }

    }

