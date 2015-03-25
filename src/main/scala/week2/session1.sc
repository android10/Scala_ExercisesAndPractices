object session1 {
  //Take the sum of integers between a and b
  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else (a) + sumInts(a + 1, b)

  //Calculate the cube of a number
  def cube(x: Int): Int = x * x * x

  //Take the sum of the cubes of all the integers between a and b
  def sumCubes(a: Int, b: Int): Int =
  if (a > b) 0
  else cube(a) + sumCubes(a + 1, b)
}