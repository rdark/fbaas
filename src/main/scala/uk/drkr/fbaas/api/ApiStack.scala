package uk.drkr.fbaas.api

import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json.NativeJsonSupport
import org.scalatra.swagger.SwaggerSupport

trait ApiStack extends ScalatraServlet
  with NativeJsonSupport
  with SwaggerSupport {

  override protected implicit def swagger = FizzBuzzApiSwagger
  // Sets up automatic case class to JSON output serialization, required by
  // the JValueResult trait.
  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "FizzBuzz-As-A-Service API"

  protected val apiVersionString: String = "v1"

  // Before every action runs, set the content type to be in JSON format.
  before() {
    contentType = formats("json")
  }

  notFound {
    contentType = formats("json")
    resourceNotFound()
  }

}

