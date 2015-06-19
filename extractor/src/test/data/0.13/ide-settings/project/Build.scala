
import sbt._
import sbt.Keys._
import _root_.sbtide.Keys._

object MyBuild extends Build {

  lazy val ideSettings = project.in(file(".")).settings(
    name := "some-name",
    organization := "some-organization",
    version := "1.2.3",
    javaHome := Some(new File("some/home")),
    javacOptions := Seq("-j1", "-j2"),
    scalaVersion := "2.10.1",
    scalacOptions := Seq("-s1", "-s2"),
    ideExcludedDirectories := Seq(file(".idea")),
    ideBasePackages := Seq("org.jetbrains", "org.intellij")
  )

  lazy val projectToSkip = project.in(file("skip")).settings(ideSkipProject := true)
}