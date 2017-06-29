# Gradle script

* Gradle uses incremental build mechanism to reduce build time for subsequent builds
* This mechanism is based on Task inputs and outputs 

# Instructions

1. This simple example demonstrates the Gradle incremental build. 
   There is generator task defined which takes number of files generated as outputs, and generates file into output directory.
   Task generator should be executed only if number of generated files property has changed, or output directory is modified.
2. Execute zip task ```gradlew zip``` and check the build/generated folder
3. Now execute the same command again and notice that generator task is UP-TO-DATE, so it was not executed by Gradle
4. Now change fileCount input propertu of generator task (e.g. fileCount=4) and execute ```gradlew zip``` again. 
   Now the generated task is executed and new nubmer of files are generated.
5. Now remove som of the generated file from build/generated folder and execute generation again. 
   As the output folder has changed, the generated task should be executed.
   Notice that zip task is UP-TO-DATE
6. You can easily reuse existing Ant tasks (Gradle is based on Ant). Check the helloAnt task and execute it.  
  




