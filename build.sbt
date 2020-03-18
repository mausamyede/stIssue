lazy val `scalajs-upgrade-test` = project
  .in(file("."))
  .enablePlugins(ScalablyTypedConverterPlugin)
  .settings(
    scalaVersion := "2.13.1",
    Compile / npmDependencies ++= Seq(
      "rsocket-websocket-client" -> "0.0.19",
      "@types/rsocket-websocket-client" -> "0.0.3"
    ),
    stStdlib := List("es6"),
  )
