package uk.drkr.fbaas.api.models

import uk.drkr.fbaas.core.FbaasCoreAlgorithm.getFizzBuzz

case class FizzBuzz(from: Int, to: Int)

object FizzBuzz {

  def get(from: Int, to: Int): List[Any] = {
    getFizzBuzz(from, to)
  }

}
