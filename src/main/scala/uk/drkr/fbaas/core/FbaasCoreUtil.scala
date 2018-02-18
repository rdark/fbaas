package uk.drkr.fbaas.core

/**
  * Core Util
  */
object FbaasCoreUtil {

  // Higher order function that takes two functions of signature Bigint =>
  // Boolean, and a BigInt. Returns true if both of those functions return true
  def isBoth(f1: BigInt => Boolean, f2: BigInt => Boolean, n: BigInt): Boolean = {
    if (f1(n) && f2(n)) return true
    false
  }

}
