
name := "Spark-Streaming"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0"


resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion,
  "com.typesafe.akka" %% "akka-actor_2.11" % "2.5.1",
  "org.typelevel"    %% "cats" % "0.7.2"
)
