package com.amrut.scala.level3.inheritance.implement


object Implementation extends App {

  object EmptyObject extends Mylist {
    override def head: Int = throw new NoSuchElementException

    override def next: Mylist = throw new NoSuchElementException

    override def isempty: Boolean = true

    override def add(value: Int): Mylist = throw new NoSuchElementException

    override def toString: String = ""
  }

  class Node(headVal: Int, list: Mylist) extends Mylist {

    override def head: Int = headVal

    override def next: Mylist = list

    override def isempty: Boolean = false

    override def add(value: Int): Mylist = new Node(value, EmptyObject)

    override def toString: String = {
      if (next.isempty) this.head.toString
      else s"[${this.head}, ${next.toString()}]"
    }
  }

  val node = new Node(1, new Node(2, EmptyObject))

  println(node.toString)

}

