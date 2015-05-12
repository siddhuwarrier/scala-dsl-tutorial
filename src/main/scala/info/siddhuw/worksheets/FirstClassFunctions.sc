case class Person(name: String, age: Int) {
  def manipulate(func: Person => Person): Person = {
    func(this)
  }
}

def doubleAge(person: Person): Person = {
  Person(person.name, person.age * 2)
}

def addSillySuffixToPersonName(suffix: String, person: Person): Person = {
  Person(person.name + suffix, person.age)
}

val p = Person("Kim ", 31)
p.manipulate(doubleAge)
val func = addSillySuffixToPersonName(" the ill", _)
p.manipulate(func)



