
implicit class Extended[T](item: T) {
  def should(matchFunction: Any => Boolean): Unit = {
    assert(matchFunction(item))
  }
}

class Be {
}

object Be {
  def apply(rightOperand: Any): Any => Boolean = {
    leftOperand: Any => {
      leftOperand equals rightOperand
    }
  }
}

1 should Be(1)




trait Matcher[T] {
  def apply(leftOperand: T): Boolean
}