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
    var dayOfWeek = "Пятница"
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
// циклы while , do while
    var isDownloaded = true
        //while (!isDownloaded){
        //println("file is downloaded...")
//    do {
//        println("file is downloaded..")
//    }
//    while(!isDownloaded)
//    println("finished")

    for (i in 1..10 step 2) /* можно идти обратно от большего к меньшему "for (i in 100 downTo 1)"*/
    {
        println("$i file is downloaded..") // &1 выведет в консоль значение i
    }
    println("finished")
    /*Основная разница между этими двумя циклами, в том, что while сразу проверяет переменную на условие,
    а do while сначала сделает действие как минимум 1 раз, а потом уже будет проверять условие*/

    // массивы

    // явное указание типа массива
    var listt: Array<Int> = arrayOf(10,11,12,13)
    var namess: Array<String> = arrayOf("Peter", "Anna", "Bob")
    var booll: Array<Boolean> = arrayOf(true , false)

    // Автоматическое определение типа массива (можно и так и так)
    var list = arrayOf(9,10,11,12,13)
    var names = arrayOf("Peter", "Anna", "Bob")
    var bool = arrayOf(true , false)

    // вывод элемента массива
    println(list[1])
    println(names[2])

    // выводи элемента массива 2 вариант   через встроенную функцию get
    println(names.get(1))

    // Rак перезаписать значение в элемент массива?
    // 1 вариант
    names[1] = "Dora"
    println(names[1])

    //2 вариант:

    names.set(1,"Kira")  // тут использована встроенная функция set
    println(names.get(1))

    //Как узнать количество элементов?
    println(list.size)


// вывод всех элементов массива через цикл for
    //1 способ
    for (i in names){
        println(i)
    }
    // 2 способ с forEach (такой способ более предпочтительный)
    names.forEach{ elem ->
        if (elem !="Bob")  // Сюда можно встраивать любые проверки
            print("Hallo, ")
        println(elem)
    }


    list.forEach{ el ->
        if (el > 10)
            println(" $el <- это число больеше 10")
        else println("$el <- это число меньше или равно 10")

        }

// Как узнать индекс каждого элемента массива?
    names.forEachIndexed{index, element ->
        println("$element индекс этого элемента = $index ")

    }
//Строковый тип и работа с ним
    val s = "Hello World!"
    println(s[0])
    println(s[1])
    println(s[s.length-1])

    println(s.first())
    println(s.last())

    val cardNumber = "1234 6789 6784 9489"
    println(cardNumber.startsWith("1234"))
    println(cardNumber.endsWith("1248"))

    println("The length of 'Hello World!' is ${s.length}") // пример использывания функции вместе с $
    println("The length of \"Hello World!\" is ${s.length}") // пример экранирования кавычек
    println("The length of \"Hello World!\" \nis ${s.length}") // Пример переноса строки оператор \n

    // кстати функция println уже содержит в себе перенос строки

    val name = "john"
    val Name = "John"
    val CapName = name.capitalize() // функция сделает слово с большой буквы
    val DecName = name.decapitalize() // функция сделает слово с маленькой буквы
    val TupName = name.toUpperCase()
    val TulName = name.toLowerCase()


    println(CapName)
    println(DecName)
    println(TupName)
    println(TulName)

    val Name1 = "раор"
    println(Name1.isEmpty()) // вернет true если пустое значение
    println(Name1.isBlank())// вернет true если нет полезных символов

    val Name2 = " John Smith "
    val TrName = Name2.trim() //функция обрезает пробелы в начале и конеце
    val TrsName = Name2.trimStart()//функция обрезает пробел в начале
    val TreName = Name2.trimEnd()//функция обрезает пробел в конеце

    println(TrName)
    println(TrsName)
    println(TreName)

    val st = "Today today morning today today sunday"
    val st2 = st.replace("today","*") // функция заменяет  слова в предложении
    val st3 = st.toLowerCase().replace("today","*") // на примере применение 2 функций одновременно

    println(st2)
    println(st3)

    val list1 = "Today,today,morning,today,today,sunday"
    val arr =  list1.split(",") // split делает из стринги массив
    println(arr)


    val sg = readln() // функция ввода
    println(sg.toUpperCase())







}






