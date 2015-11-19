package us.cernu.itsy.frontend;

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter

object FrontendMain extends FrontendServer

class FrontendServer extends HttpServer {
  override val modules = Seq(MustacheModule)
  override def configureHttp(router: HttpRouter) {
    router.add[FrontendController]
  }
}
