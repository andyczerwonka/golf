package yycfp

import org.scalatest.{FlatSpec, Matchers}

class LongestContiguousRangeSpec extends FlatSpec with Matchers {
  "Lion's example" should "evaluate to (3,8)" in {
    val xs = Vector(1, 3, 5, -9, 11, 12, 13, 15, 78484348, 11, 12 ,13, 0, -1, 343, 1222, 0)
    longestContiguousIncreasingRange(xs) shouldEqual (3,8)
  }
}
