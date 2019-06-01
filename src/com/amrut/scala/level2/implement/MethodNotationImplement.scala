package com.amrut.scala.level2.implement

object MethodNotationImplement extends App {


  val amrut = new Person("Amrut")

  println((amrut + "prabhu") (2))

  val next = +amrut

  println(next.name)

  println(next learnsScala)

  class Person(val name: String) {

    def +(value: String): Person = new Person(name + " " + value)

    def unary_+ : Person = new Person(name + "+")

    def learns(what: String) = name + s" learns $what"

    def learnsScala =  learns("Scala")

    def apply(value: Int) = s"$name is $value"
  }


}
