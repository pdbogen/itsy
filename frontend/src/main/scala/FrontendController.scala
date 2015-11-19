package us.cernu.itsy.frontend

import com.twitter.finagle.http.{Controller, Request}
import com.twitter.finatra.response.Mustache

class FrontendController extends Controller {
  @Mustache("welcome")
  get("/") { request: Request =>
    "Welcome to Itsy!"
  }
}
