# Gradle Dependency Management

* Gradle provides comprehensive	dependency management

# Instructions

1. As we already mentioned, the Gradle build script is code.
   Yu can define dependency property variables and reuse them later on in your script.
2. Open the build.gradle and notice ext. properties definition and usage in dependencies configuration block.
3. You can specify dependency by mentioning concrete file `compile files('/lib/commons-cli-1.2.jar')`
4. Dependencies grouped in configurations are nothing else than file collections, so you can access them from 
   build script code. Try to execute `gradlew dependencyFiles`     
        







