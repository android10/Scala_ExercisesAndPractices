abstract class Greeting {
  def hello(name: String) = print("Default ".concat(name))
}

trait GreetingTrait {
  def hello(name: String) = print("Trait ".concat(name))
}

class MyGreeterOne extends Greeting {
  override def hello(name: String) = print("Hello ".concat(name))
}

class MyGreeterTwo extends Greeting {
  override def hello(name: String) = print("Fuck you ".concat(name))
}

class MyGreeterThree extends Greeting {}

var myClass : Greeting = new MyGreeterOne
myClass.hello("Fernando")

myClass = new MyGreeterTwo
myClass.hello("Fernando")

myClass = new MyGreeterThree
myClass.hello("Fernando")


if (true) 1 else false
if (true) 100 else false
if (true) true else false
if (false) true else false