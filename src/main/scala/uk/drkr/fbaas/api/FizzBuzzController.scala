package uk.drkr.fbaas.api

import org.scalatra.swagger.SwaggerSupportSyntax
import uk.drkr.fbaas.api.models.FizzBuzz

class FizzBuzzController extends ApiStack {

  get("/") {
    List()
  }

  val getFizzBuzz: SwaggerSupportSyntax.OperationBuilder =
    (apiOperation[List[FizzBuzz]]("getFizzBuzz")
      summary "Get a list of FizzBuzzes"
      notes "Shows all of the Fizzbuzzes - by default starting from 1"
      parameter queryParam[Option[Int]]("to").description("Get all " +
      "Fizzbuzzes _until_ this int")
      parameter queryParam[Option[Int]]("from").description("Get all " +
      "Fizzbuzzes _from_ this int")
    )

  // default method - get a list of fizzbuzzes starting from
  get("/:to", operation(getFizzBuzz)) {
    val from: Int = params.getAsOrElse[Int]("from", 1)
    FizzBuzz.get(from, params("to").toInt)
  }

}
