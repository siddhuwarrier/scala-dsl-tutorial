//Example: Implicit methods and 'pimping'
case class PimpedAny[T](item: T) {
  def foo = "Item was pimped"
}

implicit def to[T](item: T): PimpedAny[T] = PimpedAny(item)

122.foo
"my string".foo
122 + 22


