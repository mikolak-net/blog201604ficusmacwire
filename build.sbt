import sbt._
import sbt.Keys._

name := "201604ficusplay"
organizationName := "net.mikolak"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "com.iheart" %% "ficus" % "1.2.0"
libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.2.2" % "provided"
libraryDependencies += "com.softwaremill.macwire" %% "util" % "2.2.2"