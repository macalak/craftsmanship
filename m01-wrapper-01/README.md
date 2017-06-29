# Gradle wrapper

* You do not have to download and install Gradle manually
* Gradle wrapper takes care about specific Gradle distribution installation
* Gradle wrapper is the simple Java jar with property file (gradle-wrapper.properties) and execution scripts (gradlew.bat, gradlew)
* Required Gradle distribution version is specified in wrapper property file by distributionUrl property
* You can check-in the wrapper files into VCS alongside project source code
* Gradle wrapper is supported by Java IDEs
* Use gradlew command instead gradle to build your project

# Instructions

1. Let's try some simple Java project build with Gradle wrapper
2. Check the gradle folder included among other project files. It contains the Gradle wrapper jar file along with properties. 
   The wrapper CLI scripts are included in project's root folder.
3. Now, start the build invoking `gradlew build` command. If you execute this command for first time, 
   the Gradle distribution will be downloaded before the build task is executed.
4. Check the newly created build folder for build artifacts. The libs subfolder contains 
   the resulting jar package named as project name (which is the root folder name). 
5. Now add following code at begining of _build.gradle_ script: `defaultTasks 'build'`. 
   In order to start the build process, you can now just execute `gradlew` command without any additional parameters. 
6. You can open this project in your favourite Java IDE. Gradle is integrated with Java IDE by specific Gradle IDE plugin.





