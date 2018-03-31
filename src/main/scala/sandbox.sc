val xs = Vector(1, 3, 5, -9, 11, 12, 13, 15, 78484348, 11, 12 ,13, 0, -1, 343, 1222, 0)

val indices = for {
  i <- xs.indices
  if i > 0 && xs(i) <= xs(i-1)
} yield i

val (index, length) = (0 +: indices :+ xs.size)
  .sliding(2)
  .map({ case Seq(l, r) => (l, r - l) })
  .maxBy(_._2)

val answer = (index, index + length - 1)