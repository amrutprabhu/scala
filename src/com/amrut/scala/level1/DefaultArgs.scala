package com.amrut.scala.level1

object DefaultArgs extends  App {

  // default arguments can be set.
  def factorial(n:Int, acc:Int=1):Int={
    if (n<=1) acc
    else factorial(n-1,acc*n)
  }

  println(factorial(4))

  // Named arguments

  def namedArgumnent( firstArg:Int, secondArg:Int):Unit = println(firstArg+" "+secondArg)

  namedArgumnent(secondArg = 2,firstArg = 4)
}
