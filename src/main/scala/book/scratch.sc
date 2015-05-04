import scala.math._

def greet(name: String): String = {
  "Hello ".concat(name).concat("!")
}
greet("Fernando")

def isLetter(char: Char): Boolean = {
  true
}

"Hello" intersect "World"
"Fernando".distinct
"Fernando"(3)
"Fernando".apply(3)

"Fernando Cejas".count(_.isUpper)
"Fernando Cejas".count(isLetter)
"Fernando Cejas".count(s => isLetter(s))

Array(1, 4, 9, 16)
Array.apply(1, 4, 9, 16)

pow(2, 3)
min(3, Pi)
sqrt(36)