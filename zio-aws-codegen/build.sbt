val zioVersion = "1.0.9"
val awsVersion = "2.16.78"

resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

sbtPlugin := true
organization := "io.github.vigoo"
scalacOptions := Seq("-Ypartial-unification", "-deprecation")
libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersion,
  "dev.zio" %% "zio-nio" % "1.0.0-RC9",
  "io.circe" %% "circe-yaml" % "0.13.1",
  "software.amazon.awssdk" % "codegen" % awsVersion,
  "software.amazon.awssdk" % "aws-sdk-java" % awsVersion,
  "org.scalameta" %% "scalameta" % "4.4.20+4-a68a84fb-SNAPSHOT",
  "com.lihaoyi" %% "os-lib" % "0.7.1"
)
