package com.amrut.scala.level1

object Recussion extends App {

  //tail recursion

  def stringMultiplier(value: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else
      stringMultiplier(value, n - 1, value + accumulator)
  }

  println(stringMultiplier("hello ", 3, ""))

}
