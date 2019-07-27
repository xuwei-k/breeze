scalacOptions in Global += "-deprecation"

resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")

//addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.0.2")

addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
