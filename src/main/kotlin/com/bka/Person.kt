package com.bka

import java.lang.Exception

interface Signatory {
  fun sign()
}

open class Person(val name:String, var age:Int, var isMarried : Boolean=false) : Signatory{
  var partnerName : String = "Jane"

  init {
      if(age<44) throw Exception("Invalid Age!")
  }

  override fun sign() =    println("$name aged $age can sign documents and marital status is $isMarried and partner is $partnerName")

  companion object {
    @JvmStatic
    fun main(args : Array<String>){
      val b = Person("Nilesh", 55)
      b.sign()
      b.age=50
      b.partnerName = "Usha"
      b.sign()
    }
  }
}

data class User(val Name:String, val Id:Int)

fun main(args : Array<String>){
  val b = Person("Brijesh", 45)
  b.sign()
  b.age=50
  b.sign()
  val u1 = User("Niles", 2323)
  println(u1)
  println(b)
  val (user, id) = u1
  println("The user is $user")
}

class Student(name:String, age:Int):Person(name, age)

class Banker
