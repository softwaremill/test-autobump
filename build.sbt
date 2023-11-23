import com.softwaremill.SbtSoftwareMillCommon.commonSmlBuildSettings
import Dependencies._

lazy val commonSettings = commonSmlBuildSettings ++ Seq(
  organization := "com.softwaremill.xxx",
  scalaVersion := "2.13.12"
)

lazy val rootProject = (project in file("."))
  .settings(commonSettings: _*)
  .settings(publishArtifact := false, name := "root")
  .aggregate(core)

lazy val core: Project = (project in file("core"))
  .settings(commonSettings: _*)
  .settings(
    name := "core",
    libraryDependencies ++=
      scalaTest ++
      cats ++
      http4s ++
      circe
  )

addCommandAlias(
  "format",
  "; scalafmtAll ; scalafmtSbt; Test / scalafmtAll"
)
