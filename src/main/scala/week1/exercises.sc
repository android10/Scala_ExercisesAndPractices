import scala.annotation.tailrec

/**
 * Exercise 1
 */
def pascal(c: Int, r: Int): Int = {
  if (c == 0 || c == r) 1
  else pascal(c - 1, r - 1) + pascal(c, r - 1)
}
/**
 * TEST Exercise 1
 */
pascal(0,2) //1
pascal(1,2) //2
pascal(1,3) //3

/**
 * Exercise 2
 */
def balance(chars: List[Char]): Boolean = {
  @tailrec
  def loop(stack: List[Char], remainingChars: List[Char]): Boolean = {
    if (remainingChars.isEmpty) stack.isEmpty
    else if (stack.nonEmpty && stack.head == ')') false
    else loop(processChar(stack, remainingChars.head), remainingChars.tail)
  }

  def processChar(stack: List[Char], currentChar: Char): List[Char] = {
    if (currentChar == '(') stack.::(currentChar)
    else if (currentChar == ')')
      if (stack.nonEmpty) stack.tail
      else stack.::(currentChar)
    else stack
  }

  loop(List(), chars)
}

/**
 * TEST Exercise 2
 */
balance("".toList)        //True
balance(":-)".toList)     //False
balance("())(".toList)    //False
balance("(())".toList)    //True