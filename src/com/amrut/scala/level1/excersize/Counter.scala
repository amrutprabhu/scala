package com.amrut.scala.level1.excersize

object run extends App{

  var counter = new Counter(4)

  counter.increment.increment.print
}

class Counter(val count: Int) {

  def currentCount = count

  def increment = new Counter(count + 1)

  def decrement = new Counter(count - 1)

  def decrement(value: Int) = new Counter(count - value)

  def increment(value: Int) = new Counter(count + value)

  def print = println(count)
}
