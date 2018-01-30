package example

object Hello extends Greeting with App {

  // raw data
  val xs = Vector(1, 3, 5, -9, 11, 12, 13, 15, 78484348, 11, 12 ,13, 0, -1, 343, 1222, 0)

  // detect all the changes based on the predicate (current item is smaller than the previous)
  val changes = 0 +: xs.zipWithIndex.collect { case (v, i) if i > 0 && v <= xs(i-1) => i } :+ xs.size

  // find the longest chain
  val (index, length) = changes
    .sliding(2)
    .map({case Vector(l, r) => (l, r - l)})
    .maxBy(_._2)

  // calculate the answer
  val answer = (index, index + length - 1)

  println(answer)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
