val xs = Vector(1, 3, 5, -9, 11, 12, 13, 15, 78484348, 11, 12 ,13, 0, -1, 343, 1222, 0)

val decreasingChange: PartialFunction[(Int, Int), Int] = {
  case (x, i) if i > 0 && x <= xs(i-1) => i
}

val changes = 0 +: xs.zipWithIndex.collect(decreasingChange) :+ xs.size

val (index, length) = changes
  .sliding(2)
  .map({case Seq(l, r) => (l, r - l)})
  .maxBy(_._2)

(index, index + length - 1)

val rrr = List()

