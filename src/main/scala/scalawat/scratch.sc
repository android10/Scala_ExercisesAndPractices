val foo: Int = 2
var variable: Int = 10
variable = 5
lazy val lazyVal: String = "hello world"

def square(number: Int): Int = {
  number * number
}
val squareFunction: (Int) => Int = square
val anotherSquareFunction = (number: Int) => number * number

def printAtLeastOneDog(dogOne: String, dogs: String*) {
  println(dogOne)
  println(dogs)
}
printAtLeastOneDog("Fernando", "Julian", "Carlos")
//Function parameters on demand
def printTime(was: Long, is: => Long): Unit = {
  Thread.sleep(100)
  println("Was: " + was)
  println("Is: " + is)
}
printTime(System.currentTimeMillis(), System.currentTimeMillis())

val someValue: String = if (1 == 1) {
  "1 is definitely 1"
} else {
  "Math is broken, the end is night"
}

val someExpression = {
  val text = "Some long text here..."
  text.substring(5, 12)
}

def randomNumber() = 4
val myValue = randomNumber()
var myRandomNumber = randomNumber()

class Monkey(var x: Int, var y: Int) {
  def this() = this(0, 0)
  println("creating monkey")
  def move(xMovement: Int, yMovement: Int): Unit = {
    x += xMovement
    y += yMovement
  }
}
new Monkey(1, 1).move(2, 2)
