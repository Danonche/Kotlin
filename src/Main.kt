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
    var myDouble: Double =  2.444449894894849
    var myBoolean: Boolean = true


    val myVel: Int = 1000   // val нельзя перезаписывать, тоесть после объявления такой переменной нельзя сделать myVal = 2000

    var myNull: Int?= null // может хранить пустое значение, после типа ставим "?"


    println(myAge) // стандртный вывод
    println(myName)
    println(myChar)
}