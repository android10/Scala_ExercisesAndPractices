(0 to 10).foreach(number => println(number))
0 to 5 foreach println

class Customer(val name: String, val address: String = "Berlin") {
  var id = ""
}

val fernando = new Customer("Fernando")
val yanina = new Customer("Yanina", "Argentina")
fernando.id = "000001"
yanina.id_=("000002")

val customers = List(fernando, yanina)
customers.foreach(customer => println(customer.name))
