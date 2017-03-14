## Development

* Install JDK 8
* Install IntelliJ Idea
* Install Gradle
* In IntelliJ, create a Gradle Project with support to Java
  - Create New Project
  - Select Gradle
  - In Project SDK, click New and select the directory where SDK is installed
  - Select that SDK
  - Compile
    - `GroupId` = `it.bebox.spikes`
    - `ArtifactId` = `java-bits`
    - `Version` = `0.1`
  - Select `Auto import` and `Create directories for empty content roots automatically`
  
After this step, the filesystem should have the following structure

```
~/java-bits/
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── README.md
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        ├── java
        └── resources

9 directories, 7 files
```

* Write a sample class in the file `src/main/java/javabits/Main.java` with the content

```
package javabits;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world");
    }
}
```

* Trasform the library into an application, by adding these lines to `build.gradle`

```
apply plugin: 'application'

mainClassName = 'javabits.Main'
```
