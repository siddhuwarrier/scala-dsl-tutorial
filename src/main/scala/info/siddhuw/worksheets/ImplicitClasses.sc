//Example: Implicit classes
implicit class ExtendedInt(i: Int) {
  def +:(other: Int) = List(other, i)
}

1 +: 2 +: 3

