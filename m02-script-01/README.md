# Gradle script

* Gradle build script is a code
* Remember, during configuration phase the Gradle scripts are executed. 

# Instructions

1. If there is code outside task, it will be executed. Try to execute `gradlew`. 
   There is [INFO] statement printed during execution, even no task is defined to execute. 
   You can check the initialization and configuration phase using dry run. Use `-m` option to execute build script in dry run.
2. Java plugin introduces the `check` task for static code analysis. You can add custom code after task execution for instance. 
   Check the _build.gradle_, how to do it. Code included in `doLast` is not executed during configuration phase, 
   but during execution phase. You should execute `gradlew build` to see the output. 
3. Definition of your own task is simple.
```
task myTask {
     doFirst {
         println '========================================================================'
         println '[INFO] This is my Task.'
         println '========================================================================'
     }
 }
```
4. Of course, you can use Groovy to implement specific build logic. Check the LOG_INFO closure definition. 
5. For better build logic organisation, you can split build source code into multiple 
   build script files and apply them in your main script using `apply from:`. 
   Inspect the _tasks.gradle_ and check the _build.gradle_, how it is applied. 





