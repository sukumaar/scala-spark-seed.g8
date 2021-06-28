import sbt.Keys.libraryDependencies

scalaVersion     := "2.12.14"
organization := "$organization$"
version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := """$name;format="lower,hyphen"$""",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += sparkCore % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
