package com.amrut.scala.level1.excersize

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def autherAge(): Int = author.year

  def isWrittenBy(author: Writer): Unit = this.author == author

  def copy(year: Int): Novel = new Novel(name, year, author)
}
