package com.amrut.scala.level1

object StringOperations extends App {

  val string: String = "Hello, Amrut"

  val number: String = "45"

  val value: Int = number.toInt

  println(string.reverse)
  println(string.takeRight(2))
  println(string.take(2))
  println(string.tail(0))

  // S-interpolation

  val name = "Amrut"
  val age = 30
  val form = s"hello $name age: $age"
  println(form)
  val StringLeng = s"Hello, $name, you length is ${name.length}"

  println(StringLeng)

  //f-intepolator

  val float = 1.2

  print(f"this is float $float%2.2f ")


}
