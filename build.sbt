val scala_version = "3.3.1"
// val scala_version = "2.13"

lazy val root = project
	.in(file("."))
	.settings(
		name := "wetwellsim",
		version := "0.1.0-SNAPSHOT",

		scalaVersion := scala_version,

		libraryDependencies ++= Seq(
			"com.lihaoyi" %% "upickle" % "3.1.3",
			"org.scalatest" %% "scalatest" % "3.2.13" % Test)
	)
