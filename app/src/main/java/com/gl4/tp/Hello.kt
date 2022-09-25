package com.gl4.tp

import java.lang.Math.abs

fun main(argv : Array<String> ){
    /* Activité 1 */
   /* var message1: String? = "My message can possibly be null !"
    message1?.uppercase()
    print("Hello")
    /* Activité 2 */
    var hello = "Hello"
    hello = "Hello world!"
    println(hello)
    var toto = "Toto"
    println(toto)
    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message?.toString())
    /* Activité 3 */
    fun sum ( a : Int , b : Int ) = a + b
    println(sum(2,2))
    fun sayMyName(name : String ) { println(" $name ") }
    println(sayMyName("Hadil"))
    fun sayHello() = "Hello"
    println(sayHello())
    /* Activité 4 */
    fun showList(list: List<String>){ for (i in list) { println(i) } }
    fun oddNumbersTo10(){ for (i in 1..10 step 2 ){ println(i) } }
    val languages =  listOf("Kotlin", "java", "C++", "Python")

    //fun main(args: Array<String>) {
        println("Languages :")
        showList(languages)
        println("Odd Numbers to 10 :")
        oddNumbersTo10()
    //}
    /* Activité 5 */
    // Créer une fonction qui prend en paramètres deux entiers et un opérateur ( +, -, /,*, %)
   // et renvoit le résultat de l'opération. Tester la fonction.
    fun operation(a:Int , b:Int , op :String) = when(op){
        "+" -> a + b
        "-" -> a - b
        "/" -> a / b
        "*" -> a * b
        else -> a % b
    }
    println("resultat :"+operation (2,3,"%")) */
    //print("Hello")
    /* classe Point */
    data class Point( val x:Int , val y:Int) {
        /* Distance */
        fun distance (p:Point , q:Point) = abs(p.x-q.x) + abs(p.y - q.y)
    }
    class Rectangle (var p:Point = Point(0,0), var q:Point = Point(1,1)) {
        override fun toString(): String {
            return "p=$p q=$q"
        }
        fun surface() = abs(p.x-q.x)*abs(p.y - q.y)
    }
    /* Dans le main */
    val ArrRect = arrayOf(Rectangle(),Rectangle(q=Point(1,3)),
                          Rectangle(p=Point(3,2)),Rectangle(q=Point(2,3),p=Point(4,2)))
    for (i in ArrRect) {
        println("Surface : "+i.surface())
    }
}
