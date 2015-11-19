lazy val commonSettings = Seq(
  organization := "us.cernu",
  version      := "0.0.1",
  scalaVersion := "2.11.7"
)

lazy val frontend = project
  .settings(commonSettings: _*)
  .settings(
    mainClass := Some("us.cernu.frontend.Frontend"),
    resolvers += "Twitter" at "http://maven.twttr.com",
    libraryDependencies += "com.twitter.finatra" % "finatra-http_2.11" % "2.1.1",
    libraryDependencies += "com.twitter.finatra" % "finatra-slf4j_2.11" % "2.1.1",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3"
  )
