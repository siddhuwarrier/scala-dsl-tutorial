package info.siddhuw

/**
 * Copyright (c) Cisco systems 2015. All rights reserved.
 * Date: 13/05/15
 */
trait SimpleMatcherDsl {
   implicit class ShouldOperator[T](leftOperand: T) {
     def should(matcherFunc: Any => Boolean): Unit = {
       if (!matcherFunc(leftOperand)) {
         throw new TestFailedException("Assertion failed")
       }
     }

     def should(notKeyword: NotKeyword): NotKeywordResult = NotKeywordResult(leftOperand)
   }

  def equal(rightOperand: Any): Any => Boolean = {
      leftOperand:Any => {
        leftOperand equals rightOperand
      }
  }

  val not = new NotKeyword

  sealed class NotKeyword
  sealed case class NotKeywordResult(leftOperand: Any) {
    def equal(rightOperand: Any): Unit = {
      if (leftOperand equals rightOperand) {
        throw new TestFailedException("Assertion failed")
      }
    }
  }
}


