package com.amrut.scala.level3.inheritance.implement

abstract class Mylist {

  def head:Int
  def next:Mylist
  def isempty:Boolean
  def add(value: Int):Mylist
  def toString():String
}
