val ScalatraVersion = "2.6.2"
val Json4sVersion = "3.5.3"


resolvers += Classpaths.typesafeReleases

organization := "uk.drkr"
name := "FizzBuzz-As-A-Service"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.4"
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.4"
)


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

libraryDependencies ++= Seq(
  "org.scalatra"      %% "scalatra"          % ScalatraVersion,
  "org.scalatra"      %% "scalatra-json"     % ScalatraVersion,
  "org.scalatra"      %% "scalatra-swagger"  % ScalatraVersion,
  "org.scalatra"      %% "scalatra-commands" % ScalatraVersion,
  "org.scalatra"      %% "scalatra-specs2"   % ScalatraVersion % "test",
  "org.json4s"        %% "json4s-native"     % Json4sVersion,
  "org.json4s"        %% "json4s-jackson"    % Json4sVersion,
  "ch.qos.logback"    % "logback-classic"    % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp"       % "9.4.7.v20170914" % "container",
  "javax.servlet"     % "javax.servlet-api"  % "3.1.0" % "provided"
)

enablePlugins(JettyPlugin)


// lazy val core = (project in file("core")).settings(
//   commonSettings,
//   libraryDependencies ++= Seq(
//     "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//   )
// )

// lazy val api = (project in file("api")).settings(
//   commonSettings,
//   libraryDependencies ++= Seq(
//     "org.scalatra"      %% "scalatra"         % ScalatraVersion,k
//     "org.scalatra"      %% "scalatra-json"    % ScalatraVersion,
//     "org.scalatra"      %% "scalatra-swagger" % ScalatraVersion,
//     "org.scalatra"      %% "scalatra-specs2"  % ScalatraVersion % "test",
//     "org.json4s"        %% "json4s-native"    % "3.5.0",
//     "ch.qos.logback"    % "logback-classic"   % "1.1.5" % "runtime",
//     "org.eclipse.jetty" % "jetty-webapp"      % "9.2.15.v20160210" % "container",
//     "javax.servlet"     % "javax.servlet-api" % "3.1.0" % "provided"
//   )
// ).enablePlugins(JettyPlugin)


// ScalatraPlugin.scalatraSettings
//  scalateTemplateConfig in Compile := {
//    val base = (sourceDirectory in Compile).value
//    Seq(
//      TemplateConfig(
//        base / "webapp" / "WEB-INF" / "templates",
//        Seq.empty, /* default imports should be added here */
//        Seq(
//          Binding("context", "_root_.org.scalatra.scalate.ScalatraRenderContext", importMembers = true, isImplicit = true)
//        ), /* add extra bindings here */
//        Some("templates")
//      )
//    )
//  }

// enablePlugins(JettyPlugin)

