# Gradle Dependency Management

* Gradle provides comprehensive	dependency management

# Instructions

1. This project uses the JCenter repository. Open the build.gradle and check repositories closure.
2. If you migrate from existing old project, you would need to include existing jar files as dependencies.
   You will use the flat directory repository. Check the lib folder and compile dependency.
3. Dependency tries for project's dependency configuration can be listed using `gradlew dependencies`
   Notice that junit version was resolved to 4.12. Do you know why?
4. Now, uncomment line `testCompile 'org.hamcrest:hamcrest-core:1.2'` and check resolved dependencies
   Do you know, why hamcrest version 1.3 is used instead 1.2?
   If you want build to fail, if there is version conflict, just uncomment code which sets resolutionStrategy to `failOnVersionConflict`
5. You can also exclude transitive dependency in order to use version you prefer.
```
testCompile('junit:junit:4.+') {
      exclude group:'org.hamcrest'
}
```
6. Another option you have is to force prefered version of dependency
   `testCompile group:'org.hamcrest',name:'hamcrest-core', version:'1.2', force:true`       







