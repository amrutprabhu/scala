package com.amrut.scala.level2

object StaticObject{

  def main(args:Array[String])
  {

    // singleton, type and its only instance
    object Person {
      val type_ = "Human"

      def getType = type_

      // factory method
      def getPerson = new Person("amrut")
    }

    class Person(val name: String) {

    }

    // COMPANIONS , because both class and object person

    val person = Person
    val person1 = Person

    println(person == person1) // because they are the same instance.

  }
}

