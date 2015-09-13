val list = List(5, 6, 1)
println(list)
println(list.head)
println(list.tail)
val listOne = 5 :: 6 :: 1 :: Nil
val listTwo = 5 :: (6 :: (1 :: Nil))

val map = Map(1 -> "Fernando", 2 -> "Julian")
println(map)
println(map(1))
println(map(2))
println(map + (3 -> "Cejas")) // Creates new instance.
println(map.head)
println(map.tail)

def timesTwo(number: Int): Int = number * 2
timesTwo(3)

val myList = List(10, 20, 30)
println(myList.map(timesTwo))