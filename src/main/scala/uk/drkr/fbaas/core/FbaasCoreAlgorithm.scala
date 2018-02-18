package uk.drkr.fbaas.core

import FbaasCoreUtil.isBoth

import scala.collection.mutable.ArrayBuffer

/**
  * Core Algorithms
  */
object FbaasCoreAlgorithm {

  val Fizz: Int = 3
  val Buzz: Int = 5
  val FizzStr: String = "Fizz"
  val BuzzStr: String = "Buzz"
  val FizzBuzzStr: String = FizzStr + " " + BuzzStr

  // Tail recursive factorial implementation using BigInt
  def factorial(n: BigInt): BigInt = {
    @annotation.tailrec
    def next(n: BigInt, acc: BigInt): BigInt =
      if (n <= 0) return acc
      else next(n-1, n*acc)

    next(n, 1)
  }

  // Return true if argument is a FizzBuzz, otherwise false
  def isFizzBuzz(n: BigInt): Boolean = {
    isBoth(isFizz, isBuzz, n)
  }

  // Return true if argument is a Fizz, otherwise false
  def isFizz(n: BigInt): Boolean = {
    if ((n % Fizz) == 0) return true
    false
  }

  // Return true if argument is a Buzz, otherwise false
  def isBuzz(n: BigInt): Boolean = {
    if ((n % Buzz) == 0) return true
    false
  }

  // Return a list of FizzBuzzes between two Ints
  // naive implementation using composition
  def getFizzBuzz(a: Int, b: Int) = {
    val fb = new ArrayBuffer[Any]
    for (i <- a to b) {
      if (isFizzBuzz(i)) {
        fb += FizzBuzzStr
      }
      else if (isFizz(i)) {
        fb += FizzStr
      }
      else if (isBuzz(i)) {
        fb += BuzzStr
      }
      else fb += i
    }
    fb.toList
  }

}
