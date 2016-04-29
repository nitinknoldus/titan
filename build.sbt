name := "gremlin-scala-examples-titan"
organization := "com.michaelpollmeier"
version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"
//val titanV = "1.1.0-SNAPSHOT"
val titanV = "0.5.4"

libraryDependencies ++= Seq(
  //"com.michaelpollmeier" %% "gremlin-scala" % "3.0.2-incubating.2",
  "com.michaelpollmeier" % "gremlin-scala" % "2.3.0",
	"com.thinkaurelius.titan" % "titan-core" % titanV,
	"com.thinkaurelius.titan" % "titan-cassandra" % titanV,
 "com.thinkaurelius.titan" % "titan-es" % titanV,
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "com.carrotsearch" % "hppc" % "0.6.0"

)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"