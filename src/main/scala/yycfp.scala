

package object yycfp {

  def longestContiguousIncreasingRange(xs: Seq[Int]): (Int, Int) = {

    // define a partial that takes current value->index tuple and returns the index if the current value is <=previous
    val decreasingChange: PartialFunction[(Int, Int), Int] = {
      case (x, i) if i > 0 && x <= xs(i-1) => i
    }

    // detect all the changes based on the decreasingChange function above
    val changes = 0 +: xs.zipWithIndex.collect(decreasingChange) :+ xs.size

    // find the longest chain
    val (index, length) = changes
      .sliding(2)
      .map({case Seq(l, r) => (l, r - l)})
      .maxBy(_._2)

    // return the two indexes
    (index, index + length - 1)
  }

}
