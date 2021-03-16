name := "reactive-mongo-test"

version := "0.1"

scalaVersion := "2.12.12"

val reactiveMongo = "1.0.3"

libraryDependencies ++= Seq(
      "org.reactivemongo" %% "reactivemongo" % reactiveMongo,
      "org.reactivemongo" %% "reactivemongo-akkastream" % reactiveMongo,
      "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "3.0.0" % Test,
      "ch.qos.logback" % "logback-classic" % "1.2.3" ,
      "org.scalatest" %% "scalatest" % "3.1.2" % Test,
      "com.typesafe.akka" %% "akka-slf4j" % "2.5.25"
)

