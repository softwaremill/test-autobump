import sbt.*

object Dependencies {

  lazy val cats: Seq[ModuleID] = Seq(
    "org.typelevel" %% "cats-core" % Versions.cats,
    "org.typelevel" %% "cats-effect" % Versions.catsEffect
  )

  lazy val http4s: Seq[ModuleID] = Seq(
    "org.http4s" %% "http4s-ember-client" % Versions.http4s,
    "org.http4s" %% "http4s-ember-server" % Versions.http4s,
    "org.http4s" %% "http4s-circe" % Versions.http4s,
    "org.http4s" %% "http4s-dsl" % Versions.http4s
  )

  lazy val scalaTest: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % Versions.scalaTest % Test
  )

  lazy val circe = Seq(
    "io.circe" %% "circe-core" % Versions.circe,
    "io.circe" %% "circe-generic" % Versions.circe,
    "io.circe" %% "circe-parser" % Versions.circe,
    "org.typelevel" %% "kittens"                % Versions.kittens,
    "org.typelevel" %% "cats-testkit-scalatest" % Versions.catsTestkit % Test,
  )

  lazy val natchez: Seq[ModuleID] = Seq(
    "org.tpolecat" %% "natchez-datadog" % Versions.natchez,
    "org.tpolecat" %% "natchez-log" % Versions.natchez,
    "org.tpolecat" %% "natchez-http4s" % Versions.natchezHttp4s
  )

  lazy val pureconfig: Seq[ModuleID] = Seq(
    "com.github.pureconfig" %% "pureconfig-core" % Versions.pureconfig,
    "com.github.pureconfig" %% "pureconfig-ip4s" % Versions.pureconfig
  )

  lazy val metrics = Seq(
    "com.avast.cloud" %% "datadog4s" % Versions.datadog4s
  )

  lazy val logging = Seq(
    "org.apache.logging.log4j" % "log4j-core" % Versions.log4j2,
    "org.apache.logging.log4j" % "log4j-layout-template-json" % Versions.log4j2,
    "org.apache.logging.log4j" % "log4j-slf4j-impl" % Versions.log4j2,
    "org.apache.logging.log4j" % "log4j-slf4j2-impl" % Versions.log4j2,
    "org.typelevel" %% "log4cats-slf4j" % Versions.log4cats
  )

  lazy val zio = Seq(
    "dev.zio" %% "zio" % Versions.zio,

  )
}
