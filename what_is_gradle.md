# What is Gradle

## Introduction
Gradle is a build automation tool

**Building a project means(steps):**

* Compile --> compiling the source code
* Run Tests --> compiling and running test both unit and integration
* Package --> packaging the compile source code into .jar .war or even docker images
* Deploy --> We then deploy this artifcats on cloud or server and run

All this task can be automated using gradle. Before Gradle we have build tools like Ant, Maven etc.

But on those we had to create a lot of XML based configurations.
* We need to create a build.xml file for our projects

* We used various XML based **tasks** that ANT provides

### Ant:
#### Advantage/Disadvantage of 
* It's very easy to customize
* It doesn't have in built dependancy management. So we have to use 3rd party tools like **Ivy** to manage the libraries and dependancies that is required for our projects
* Ant uses a lot of XML and XML based tasks. When we move one projects to another there might be different folder structure. At that maven comes in.

### Maven
Maven saves huge convention over configuration. At there we have to maintain a uniform folder structure instead of using custom folder structure.

* we don't have to worry moving the projects from one project to another
* Maven also has in-build dependancy management system. It also use xml at a minimum rate.

##### Limitations of Maven:
* the main problem comes in when we have to customize our projects
* When we have a huge projet like an ERP or others maintaining all the things in maven makes harder. That is why **gradle** comes in.

### Gradle
It uses everything in good in both ant and maven
* It supports convention over configurations.(very similar to maven. We wil follow the same folder structure)

* We can also customize. We can create our own Task which is not available in the given structure.
* Gradle uses programming language like **Groovy** or **Kotlin** inside build.gradle.
* We don't have to use any XML
