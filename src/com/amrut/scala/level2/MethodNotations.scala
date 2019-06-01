package com.amrut.scala.level2

object MethodNotations extends App {

  class Person(val name: String) {

    def worksWith(name: String): String = s"${this.name} works with ${name}"

    def +(surname: String) = {
      println("this is called")
      this.name + " " + surname
    }

    // has to be unary_
    def unary_! : String = name.reverse
    def isTrue :Boolean = true

    // has to be apply to use ()
    def apply() : String = "applied function"
  }

  val amrut = new Person("Amrut")

  println(amrut worksWith "prabhu")
  // infix notations
  println(amrut + "prabhu")

  // ALL operators are methods
  println(1.+(2))

  //unary prefix notations operators works with +,-,~,!
  println(!amrut)


  // postfix notation
  println(amrut isTrue)


  // Special apply function
  println(amrut.apply)
  println(amrut())
}
