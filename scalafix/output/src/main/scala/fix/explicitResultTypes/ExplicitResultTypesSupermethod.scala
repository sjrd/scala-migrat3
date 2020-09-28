package fix.explicitResultTypes

object ExplicitResultTypesSupermethod {
  class Animal
  class Dog extends Animal
  trait Animals {
    def animal: Animal
  }
  class Dogs extends Animals {
    def animal: fix.explicitResultTypes.ExplicitResultTypesSupermethod.Dog = new Dog()
  }
  def run(dog: Dog): Unit = println(dog)
  def app(): Unit = run(new Dogs().animal)
}
