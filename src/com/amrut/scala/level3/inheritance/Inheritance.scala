package com.amrut.scala.level3.inheritance

object Inheritance extends App {

  //overriding methods

  class person(name: String, age: Int) {
    // another constructor
    def this(name: String) = this(name, 0)

    def showDetails() = println(name + " " + age)
  }

  class Adult(name: String, age: Int, Id: String) extends person(name = name) {
    override def showDetails(): Unit = println(name + " " + age + " " + Id)
  }

  val amrut = new Adult("amrut", 30, "I have it")

  amrut.showDetails

  ///---------------------------------------
  // overriding fields
  class Animal {
    val type_ = "wild"
  }

  class Dog(dogType: String) extends Animal {
    override val type_ : String = this.dogType
  }

  val dog = new Dog("domestic")
  println(dog.type_)

  // final can used to prevent overriding, same as java

  // `SEALED` keyword, can be used to seal the class from overriding from other files. Bu they can be overriden in the same file.

}
