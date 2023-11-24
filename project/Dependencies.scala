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
}
