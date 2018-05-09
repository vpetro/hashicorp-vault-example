name := "temp"
scalaVersion := "2.11.12"

resolvers += Resolver.bintrayRepo("janstenpickle", "maven")
resolvers += Resolver.bintrayRepo("albertpastrana", "maven") 

libraryDependencies += "janstenpickle.vault" %% "vault-core" % "0.4.0"
libraryDependencies += "janstenpickle.vault" %% "vault-auth" % "0.4.0"
libraryDependencies += "janstenpickle.vault" %% "vault-manage" % "0.4.0"
