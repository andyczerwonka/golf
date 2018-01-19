package example

object Hello extends Greeting with App {

  val xs = List(1, 3, 5, -9, 11, 12, 13, 15, 78484348, 11, 12 ,13, 0, -1, 343, 1222, 0)
  val is = 0 :: xs.zipWithIndex.collect { case (v, i) if i > 0 && v <= xs(i-1) => i }
  println(is)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
