package object yycfp {

  def longestContiguousIncreasingRange(xs: Seq[Int]): (Int, Int) = {
    // detect all the changes based on the predicate (current item is smaller than the previous)
    val changes = 0 +: xs.zipWithIndex.collect { case (v, i) if i > 0 && v <= xs(i-1) => i } :+ xs.size

    // find the longest chain
    val (index, length) = changes
      .sliding(2)
      .map({case Seq(l, r) => (l, r - l)})
      .maxBy(_._2)

    // return the two indexes
    (index, index + length - 1)
  }

}
