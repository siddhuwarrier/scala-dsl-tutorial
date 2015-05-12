//Example: The optional Dot membership operator
import scala.language.postfixOps
class Foo {
  def bar = "This is the bar method"
}

val foo = new Foo()
foo.bar
foo bar