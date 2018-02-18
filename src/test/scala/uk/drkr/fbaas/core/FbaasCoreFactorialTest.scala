package uk.drkr.fbaas.core

import org.scalatest.FunSuite

/**
  * Unit tests for Factorial
  */
class FbaasCoreFactorialTest extends FunSuite {

  val fbaasCore = FbaasCoreAlgorithm

  val factorials = List(
    1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880,
    3628800, 39916800, 479001600
  )

  val bigFactorials = List(
    6227020800L, 87178291200L, 1307674368000L, 20922789888000L,
    355687428096000L, 6402373705728000L
  )

  // naive test for factorials that go as big as Int
  test("Int factorials") {
    factorials.zipWithIndex foreach {
      case(fact, i) => assert(fbaasCore.factorial(i)  == fact)
    }
  }

  // naive test for factorials that start bigger than Int
  test("BigInt factorials") {
    bigFactorials.zipWithIndex foreach {
      case(fact, i) => assert {
        fbaasCore.factorial(i + factorials.length) == fact
      }
    }
  }

}
