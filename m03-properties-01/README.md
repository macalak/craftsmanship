# Gradle Environment and Properties

* Gradle provides several options how to configure project build
* You can use environment variables and configuration property files 

# Instructions

1. This simple example demonstrates several options how to set project properties
   Open the gradle.properties file and check how Project and System property is defined
   Execute `gradlew pP` command and check the output
2. Now copy the gradle.properties file from project folder into your user home folder
   Change value of my_property and execute printProperties task one more time. Value of my_property should be overridden.
3. my_property can be further overridden by -P command line option
   Try to execute following command `gradlew -Pmy_property='PROJECT property from cmd line' pP`
4. In some cases is useful to set properties in Environment.
   export env property like this `export ORG_GRADLE_PROJECT_my_property='PROJECT property from env'`
   Now print properties and check the result. Ussage of -P should still work and override property. 
    
  




