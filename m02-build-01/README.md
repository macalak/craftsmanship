# Gradle build

* Gradle build consists of one or more build scripts
* Default build script name is build.gradle. You can name your script differently, 
  but you will have to use the -b property during execution

# Instructions

1. Open and inspect the _build.gradle_ script. This one is very simple. It defines only java plugin. 
   But Java plugin brings many features to your build.
2. Execute gradlew tasks command to list available build tasks, you can execute.
3. You can specify more than one task, when you start your build. Now try `gradlew clean` build. 
   This execution cleans the build folder first and then starts new fresh build.
4. Gradle always tries to determine the task name which should be executed, even you do not provide complete task name. 
   Now try to execute `gradlew cle bu`. If you try `gradlew cl bu`, it should fail as `cl` is ambiguous (there is also classes task).
5. As you probably noticed from the build log, the `build` task depends on more tasks. 
   Tasks are organized in DAG (Directed Acyclic Graph) graph. You can exclude any task during execution. 
   Now try `gradlew -x test clean build`. The `test` task should not be executed this time.
6. If you want to see task dependencies execute `gradlew tasks --all`.







