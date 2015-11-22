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