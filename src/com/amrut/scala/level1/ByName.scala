package com.amrut.scala.level1

object ByName extends App {

  // => by name parameter
  // lazy evaluated

  def byName(x: => Long){
    println(x)
  }


  byName(System.nanoTime())
}
