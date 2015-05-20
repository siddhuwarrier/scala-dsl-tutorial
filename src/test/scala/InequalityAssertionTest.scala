import info.siddhuw.{TestFailedException, SimpleMatcherDsl}
import org.junit.Test

class InequalityAssertionTest extends SimpleMatcherDsl {
  case class Animal(species: String)

  @Test
  def shouldNotFailIfTwoUnequalObjectsOfSameTypeAreCompared(): Unit = {
    Animal("dog") should not equal Animal("cat")
  }

  @Test
  def shouldNotFailIfTwoObjsOfDifferentTypesAreCompared(): Unit = {
    Animal("dog") should not equal 114
  }

  @Test
  def shouldNotFailIfRhsIsNull(): Unit = {
    Animal("dog") should not equal null
  }

  @Test(expected=classOf[TestFailedException])
  def shouldFailIfTwoObjectsAreEqual(): Unit = {
    Animal("dog") should not equal Animal("dog")
  }
}
