import sbt.Keys.libraryDependencies

ThisBuild / scalaVersion     := "2.12.14"
ThisBuild / version          := "1.0-SNAPSHOT"
ThisBuild / organization     := "$organization$"

lazy val root = (project in file("."))
  .settings(
    name := """$name;format="lower,hyphen"$""",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += sparkCore % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
