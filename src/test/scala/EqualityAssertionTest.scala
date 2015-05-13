import info.siddhuw.{TestFailedException, SimpleMatcherDsl}
import org.junit.Test

/**
 * Copyright (c) Cisco systems 2015. All rights reserved.
 * Date: 13/05/15
 */
class EqualityAssertionTest extends SimpleMatcherDsl {

  sealed case class Person(name: String)

  @Test
  def shouldNotFailIfTwoEqualObjectsAreCompared() {
    Person("doggie") should equal(Person("doggie"))
  }

  @Test(expected = classOf[TestFailedException])
  def shouldFailIfTwoUnequalObjectsOfSameTypeAreCompared() {
    Person("doggie") should equal(Person("hawser"))
  }

  @Test(expected = classOf[TestFailedException])
  def shouldFailIfTwoObjectsOfDifferentTypesAreCompared() {
    Person("doggie") should equal ("doggie")
  }

  @Test(expected = classOf[TestFailedException])
  def shouldFailIfRhsOfAssertionIsNull() {
    Person("doggie") should equal(null)
  }
}
