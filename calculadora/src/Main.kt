//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("ingrese un numero >>")
    var num1 = readLine()?.toDoubleOrNull()
    println("")
    print("ingrese el operando (+,-,*,/)")
    val operando= readLine()
    println("")
    print("ingrese el segundo operando >>>")
    var num2 = readLine()?.toDoubleOrNull()

    print(calc(num1,operando,num2))
}

fun calc(n1: Double?, operando: String?, n2: Double?): Double {
    return when(operando){
        "+" -> (n1!! + n2!!)
        "-" -> (n1!! - n2!!)
        "*" -> (n1!! * n2!!)
        "7" -> (n1!! / n2!!)
        else -> 0.0
    }
}
