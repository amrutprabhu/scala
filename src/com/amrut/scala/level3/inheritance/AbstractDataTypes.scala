package com.amrut.scala.level3.inheritance

object AbstractDataTypes extends App {

  // Abstract classes
  abstract class animal{
    val animalType:String
    def eat:Unit

  }

  class Dog extends animal{
    override val animalType: String = "k8"

    def eat: Unit = println("Dog eat")
  }

  //---------------------------------------------------------------------

  // traits

   trait ferocious{
     def eat:Unit
   }

  class Cat extends animal with ferocious{
    override val animalType: String = "dumb"

    override def eat: Unit = println("cat is eating")
  }

  val cat = new Cat
  println(cat.animalType)

  // ------------------------------------------------

  //note;
  // traits can have abstract and non abstract methods or members

  // traits vs abstract
  //1. traits cannot have constructor paramets
  //2. you can inherit multiple traits using `with`
  //3. traits are behaviours(just like interfaces), abstract is a thing
}
