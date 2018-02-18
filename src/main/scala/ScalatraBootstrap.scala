import javax.servlet.ServletContext

import org.scalatra.LifeCycle
import org.slf4j.LoggerFactory
import uk.drkr.fbaas.api.{ApiRootController, DocsServlet, FactorialController, FizzBuzzController}

class ScalatraBootstrap extends LifeCycle {
  private[this] val logger = LoggerFactory.getLogger(getClass)
  override def init(context: ServletContext) {
    logger.info(context.getContextPath)
    context.mount(new ApiRootController, "/api/v1/", "root")
    context.mount(new FizzBuzzController, "/api/v1/fizzbuzz/", "fizzbuzz")
    context.mount(new FactorialController, "/api/v1/factorial/", "factorial")
    context.mount(new DocsServlet, "/api-docs", "api-docs")
    logger.info(s"API Started.")
  }
}
