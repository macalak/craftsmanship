# Gradle script

* Gradle Projects consists of Tasks
* Task logic should be defined in doFirst, or doLast closures. Not directly in task body. 
* Gradle provides default logger implementation. To see log messages use -d or -i parameter. 

# Instructions

1. Use doLast to add code into 'myTask'
  Hint: 
```
myTask.doLast { logger.info('doLast: This is my Task.') }
```
  The INFO level is logged, only if you specify debug option for gradlew (`gradlew -i`).
2. Gradle task can have no cyclic dependency on other tasks. If you execute build task, the myTask is not listed in output log. 
   In order to include myTask into build, you should define such dependency. Add following code `build.dependsOn myTask` and rebuild project.
3. If you want myTask to depend on test task for instance, just define this dependency in myTask definition. 
   You can do this by several code construction. Some examples include:
  - `task myTask (dependsOn: test){...}`  
  - `task myTask { dependsOn test ...`
4. The task ordering can be defined also by `shouldRunAfter`, `mustRunAfter` and `finalizedBy` dependency groups. 
   For instance, if you need to define custom processing after artifact are assembled, use `assemble.finalizedBy myTask`     
5. Naming your tasks by camel case has advantage, as you can specify task name by mentioning first letter of each word. 
   To execute mySecontTask, you can run `gradlew mST`       
6. Tasks can be executed conditionally using `myTask.onlyIf ` statement. You can for instance execute different tasks based on environment. 




