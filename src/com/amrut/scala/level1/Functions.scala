package com.amrut.scala.level1

object Functions extends App {

  def myfunction (a:Int): String =
  "a"+ a
  println(myfunction(1))

  def func1():String = "amrut"
  println(func1)

  def functionExpress(name: String): Unit = print("Hello"+ name)

  def function1(val1:Int) = {
    def inner(val2:Int):Unit = println("hello")

    inner(val1)
  }
  function1(2)

  def factorial(n:Int):Int ={
    if(n==2) 2
    else n* factorial(n-1)
  }

  println(factorial(4))

  def fibonacci(n:Int):Int ={
    if(n<2) 1

    n+fibonacci(n-1)
  }
}
