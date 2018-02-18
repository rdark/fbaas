package uk.drkr.fbaas.api.models

import uk.drkr.fbaas.core.FbaasCoreAlgorithm.factorial

case class Factorial(of: Int)

object Factorial {

  def get(of: Int): BigInt = {
    factorial(of)
  }

}

