val language = "Scala"

def min (x: Int, y: Int) = if (x < y) x else y

min(2, 3)
min(280, 150)

val age: Int = 35
age * .5
age * .3

35 toString

//immutable
val list = List("a", "b", "c")
list.foreach(str => println(str))
list.foreach(println)

val map = Map(1 -> "Fernando", 2 -> "Cejas")

class Stack[+A] {
  def push[B >: A](b: B): Stack[B] = {
    null
  }
}

def functionAsParamOne(f: () => Boolean) = {
  f.apply()
}

def functionAsParamTwo(f: String => Boolean) = {
  f.apply("Thursday")
}

def functionAsParamWithArgs(f: String => String) = {
  f.apply("FerNaNdo")
}

def toUpperCase(str: String): String = {
  str toUpperCase
}

def toLowerCase(str: String): String = {
  str toLowerCase
}

def isThursday(str: String): Boolean = {
  if (str == "Thursday")
    true
  else
    false
}

functionAsParamOne(() => if (1 > 2) true else false)
functionAsParamTwo(day => isThursday(day))
functionAsParamWithArgs((str) => toUpperCase(str))
functionAsParamWithArgs((str) => toLowerCase(str))