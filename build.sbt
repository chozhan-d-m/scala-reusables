import sbt.Keys.libraryDependencies

val commonSettings = Seq(
  name := "scala-reusables",
  version := "0.1" ,
  scalaVersion := "2.11.8",
  resolvers ++= Seq(
    "Maven2" at "http://repo.maven.apache.org/maven2/"
  )
)
