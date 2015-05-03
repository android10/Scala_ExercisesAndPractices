type Set = Int => Boolean
def contains(s: Set, elem: Int): Boolean = s(elem)

def singletonSet(elem: Int): Set = _ == elem
