import scala.language.dynamics

class Foo extends scala.Dynamic {
  def updateDynamic(name: Int)(value: Int): Unit = ???
}

object DynamicTest {
  new Foo().bazUpdate = 42 // error
}
