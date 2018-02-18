package uk.drkr.fbaas.api

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, NativeSwaggerBase, Swagger}

class DocsServlet extends ScalatraServlet with NativeSwaggerBase {

  override protected implicit def swagger = FizzBuzzApiSwagger

}

object FizzBuzzApiInfo extends ApiInfo(
  title = "The FizzBuzz-as-a-Service API",
  description = "Docs for the FizzBuzz-as-a-Service API",
  termsOfServiceUrl = "http://drkr.uk",
  contact = "richard@drkr.uk",
  license = "MIT",
  licenseUrl = "http://opensource.org/licenses/MIT"
)

object FizzBuzzApiSwagger extends Swagger(Swagger.SpecVersion, "1", FizzBuzzApiInfo)
