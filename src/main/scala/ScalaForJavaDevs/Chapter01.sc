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