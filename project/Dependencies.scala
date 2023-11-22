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
}
