package uk.drkr.fbaas.api

import org.scalatra.swagger.SwaggerSupportSyntax
import uk.drkr.fbaas.api.models.Factorial

class FactorialController extends ApiStack {

  val getFactorial: SwaggerSupportSyntax.OperationBuilder =
    (apiOperation[Int]("getFactorial")
      summary "Get a factorial"
      notes "Gets a factorial"
      parameter queryParam[Option[Int]]("of").description("Get the factorial" +
      " of this number")
    )

  get("/:of", operation(getFactorial)) {
    Factorial.get(params("of").toInt)
  }

}
