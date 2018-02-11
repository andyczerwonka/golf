package yycfp

import org.scalatest.{FlatSpec, Matchers}

class LongestContiguousRangeSpec extends FlatSpec with Matchers {

  "The longestContiguousIncreasingRange function" should "evaluate to (3,8) in Lion's example" in {
    val xs = Vector(1, 3, 5, -9, 11, 12, 13, 15, 78484348, 11, 12 ,13, 0, -1, 343, 1222, 0)
    longestContiguousIncreasingRange(xs) shouldEqual Some(3,8)
  }

  it should "return None if the input sequence decreases" in {
    longestContiguousIncreasingRange(Vector(5, 4, 3, 2, 1)) shouldEqual Some(0,0)
  }

  it should "return None if the input sequence contains one element" in {
    longestContiguousIncreasingRange(Vector(1)) shouldEqual Some(0,0)
  }

  it should "return (0,1) if the input sequence contains two increasing elements" in {
    longestContiguousIncreasingRange(Vector(1, 2)) shouldEqual Some(0,1)
  }

  it should "return None when the input sequence is empty" in {
    longestContiguousIncreasingRange(Nil) shouldEqual None
  }

}
