package uk.drkr.fbaas.core

import org.scalatest.FunSuite

/**
  * Unit tests for fizzbuzz
  */
class FbaasCoreFizzBuzzTest extends FunSuite {

  val fbaasCore = FbaasCoreAlgorithm

  // list of integers that are fizzes
  val fizzes = List(
    3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57,
    60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99, 102, 105
  )

  // list of integers that are buzzes
  val buzzes = List(
    5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
    95, 100, 105, 110, 115, 120, 125, 130, 135
  )

  // list of integers that are both buzzes and fizzes (fizzBuzzes)
  val fizzBuzzes = List(
    15, 30, 45, 60, 75, 105
  )

  val fizzBuzz50: Seq[Any] = List(1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8,
    "Fizz", "Buzz", 11, "Fizz", 13, 14, "Fizz Buzz", 16, 17, "Fizz", 19,
    "Buzz", "Fizz", 22, 23, "Fizz", "Buzz", 26, "Fizz", 28, 29, "Fizz Buzz", 31, 32,
    "Fizz", 34, "Buzz", "Fizz", 37, 38, "Fizz", "Buzz", 41, "Fizz", 43, 44,
    "Fizz Buzz", 46, 47, "Fizz", 49, "Buzz"
  )

  // naive test for fizzes
  test("isFizz") {
    fizzes.foreach((i: Int) => assert(fbaasCore.isFizz(i) == true))
  }

  // naive test for buzzes
  test("isBuzz") {
    buzzes.foreach((i: Int) => assert(fbaasCore.isBuzz(i) == true))
  }

  // naive test for fizzBuzzes
  test("isFizzBuzz") {
    fizzBuzzes.foreach((i: Int) => assert(fbaasCore.isFizzBuzz(i) == true))
  }

  test("FizzBuzzes 1 to 50") {
    assert(fbaasCore.getFizzBuzz(1, 50) == fizzBuzz50)
  }

}
