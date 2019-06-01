package com.amrut.scala.level3.inheritance.implement

object Implementation extends App {

  object EmptyObject extends Mylist {
    override def head: Int = throw new NoSuchElementException

    override def next: Mylist = throw new NoSuchElementException

    override def isempty: Boolean = false

    override def add(value: Int): Mylist = throw new NoSuchElementException
  }

  class Node(headVal: Int, list: Mylist) extends Mylist {

    override def head: Int = headVal

    override def next: Mylist = list

    override def isempty: Boolean = false

    override def add(value: Int): Mylist = new Node(value, EmptyObject)
  }


  object application extends App{

    val node = new Node(1, new Node(2,EmptyObject))


  }
}
