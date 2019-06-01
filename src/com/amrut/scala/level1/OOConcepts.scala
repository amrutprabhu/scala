package com.amrut.scala.level1

object OOConcepts extends App {

  val person = new Person("Amrut",12)
  println(person.name)
  println(person.greet("John"))
}

class Person(val name:String, age:Int){
  //class member
  val address =1;
  println("call instantiated")

  // custom constructor
  def this(name:String) = this(name,0)

  // methods
  def greet(name:String):Unit = println(s"hello $name by ${this.name}")
}