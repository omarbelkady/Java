## Maven

- PM tool for JVM Languages

- Used To Perform Major Tasks:
    - Build Your Source Code
    
    - Testing Your Code

    - Packaging Your Code(JAR, WAR, EAR)

    - Generate Java docs

    - Dependency Management

    - Handling, Versioning Your Artifacts

### How To Install

    - Head over to: https://maven.apache.org/download.cgi
    - Download the Binary Zip Archive
    - Extract It

### 2- Create an environment variable in your system name it M2_HOME

    - This is where Other SW and libraries look for the Maven Installation
    - Give it a path in the bin folder

### Checking if the installation is successful

```bash
mvn --version
```

### File Structure

```
├── /my-project-demo
	├── /.idea
	├── /src
		├── /main
		    ├── /java
		    └── /resources
	    ├── /test	
		    └── /java   	    
	├── /target
	└── pom.xml 
├── /External Libraries
└── /Scratches and Consoles
```

- All the static files go in our resources folder
- e.g. Property Files, or any file we need to read from(xml, csv,html, css, js)
- test file I store all my unit tests and integration tests 
- pom.xml holds all the metadata of my Application i.e. project dependencies
- target folder holds all the java compiled class files

### Creating A Project

    - Give it an artifact id(this is usually the name of your project) e.g. my-project-demo
    - Give it group Id(this is usually the name of your company id in reverse order i.e. com.herokuapp.omarbelkady)
    - Give it a version number e.g. 1.0-SNAPSHOT


### 3rd Party JAR files i.e. Dependencies

- External Libraries are called "dependencies"
- Maven provides me with functionality on how to manage my dependencies
- ...thanks to the pom.xml file

### Life Without Maven

- I have to manually download the JAR files from the internet
- then I add them one by one

### Dependency Section Thanks To Maven

- Maven provides me with a dependency section where I can specify the info of the JAR I require in my project
    - artifactid
    - groupid
    - version
- Maven will then automatically download these dependency specified, from the internet and load them into my project
- Load each dependency in a "dependency" tag
- And all your depenency tags should be in between 1 dependencies tag

```xml
<dependencies>
    <dependencyA>

    </dependencyA>

    <dependencyB>
    
    </dependencyB>
<dependencies >
```

- To add a dependency go to <https://www.mvnrepository.com/>

- Click on the Maven Icon to force IntelliJ to download the dependencies you have specified

### Transitive Dependencies

- Dependencies of my dependencies

```
├── /my-project-demo
	├── /.idea
	├── /src
		├── /main
		    ├── /java
		    └── /resources
	    ├── /test
		    └── /java
	├── /target
	└── pom.xml
├── /External Libraries
└── /Scratches_and_Consoles
```

- All the static files go in our resources folder
- e.g. Property Files, or any file we need to read from(xml, csv,html, css, js)
- test file I store all my unit tests and integration tests 
- pom.xml holds all the metadata of my Application i.e. project dependencies
- target folder holds all the java compiled class files

### Maven Dependency

- Can be categorized into two categories:
	- Snapshot Dependency
		- This dependency was created when the software was in active development
		- Unstable
	- Release Dependency:
		- This dependency was created after the software was developed and is ready to be released i.e. ready to be deployed for production
		- Stable

- In all, when I am developing the software I use the snapshot versions for the dependencies. When the software is released, I use the release versions

---

### Dependency Scopes

- enables me to control the visibility of a Maven depenendency
- 5 types:

1. **Compile**: made available at compile time within classpath [default scope]

2. **Provided**: dependency provided at runtime by JDK or webserver, e.g. Servlet API dependency. The web server which is running my project provides me with the java servlet-api during runtime. This means that the dependency will be available in the class path of the project but will not be packaged in the JAR file nor the WAR file

3. **Runtime**: dependency provided ONLY at runtime and NOT at compile time e.g. MySQL JDBC connector dependency. I mark the dependency as runtime to make sure I do not use the MySQL JDBC classes in my code instead of standard jdbc api

4. **Tests**: dependency only available at the time of writing and running my unit tests e.g. junit, spring-boot-starter-test

5. **System**: the path to the JAR should be specified manually using the < systemPath > tag. The only restriction is that I must specify the exact path of where to locate this dependency within my system.

### Repositories

- a special directory called a **repository** is the location where Maven stores my dependencies
- Local Repository[directory/folder in your machine]
- Remote Repository[Maven Website] where I can download the Maven dependencies
- If a dependency I specified in my pom is not in my local repository it goes ahead and connects to the remote repository and downloads the remote repository and stores the dependency within my local repository

#### How To Define A Repository within my POM always after my closing dependency tag

```xml
<repositories>
		<repository>
				<id>my-internal-website</id>
				<url>https://myserver/repo</url>
		</repository>
</repositories>
```

### Build Lifecycle Within Maven

- How Does Maven Build Our Projects?
	1. default
	2. clean
	3. site

#### Default Lifecycle Build Step Phases

1. validate  
	- Makes sure pom.xml is validated or not validated
2. compile
	- Compiles my source code
3. test
	- Runs the unit tests in my project
4. package
	- Packages the source code into an artifact
5. integration-test
	- Executes the integration tests
6. verify
	- Verifies the results of the integrations tests
7. install
	- Installs the newly created package files(JAR or  any other artifact) within my local repository
	- Maven
8. deploy
	- Deploy the newly created package to the remote repository
	- If the newly created package is configured in the pom.xml file it will deploy the new package into the remote repository

### Command

```java
mvn clean install
```

- This command compiles the source code
- Runs the unit tests
- Creates the JAR file
- Install the JAR file into your local repository

### Site Step

- generate Java documentation that is present in my project

### Plugins and Goals

- To be able to execute the different lifecyle phases, Maven provides me with different plugins in order for me to perform each task in the lifecycle
- Every plugin has a relationship to a goal which is linked to the lifecycle phase(e.g. compile)
- To declare a plugin simple place in between a **plugin** tag that is within the **plugins** tag
- Any plugin I want to define must be within the build tag
- The build tag will usually  be right below the dependencies section

```xml
<build>
	<plugins>
			<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>		
					<version>3.8.1</version> 
			</plugin>
	</plugins>
</build>
```

- The plugin above is in charge of compiling any test files or source files I have within my project. This is familiar to running

```java
javac nameofclass.java
```

#### To trigger the compile lifecycle phase

```java
mvn compiler:compile
```

### Maven tab⇒ Plugin section ⇒ Hit Expand ⇒ Click on Compile Goal

- Compilation fails
- Java compiler of Maven within IntelliJ is configured to Java version 1.X
- To fix:
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0. Go to your pom.xml
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1. Head to build section
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2. Plugins ⇒ plugin
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3. Configuration Tag
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4. Change the source & target properties to the java version installed on your machine

### Maven Install Plugin

- This plugin is used to run the install lifecycle phase within the maven build lifecycle

1. Compiles My Source Code
2. Runs Our Unit Tests
3. Package The Cource Code into an Artifact
4. Installs The Artifact Within My Local Repository


### Maven Deploy Plugin

- Self-explanatory plugin 
- runs all the phases which are part of the install phase
- deploys the created artifact to the remote repository

0. To deploy the artifact to the remote repo you have to specify the remote repo details within your pom
1. Create a tag right above your dependencies tag and give it a name of **distributionManagement**
2. Within the distributionManagement tag create a tag named **repository** and place the information of your repository there
3. To uniquely identify a repository I specify the **id**, **name** and **url**
4. Run the command below to deploy your plugin

```java
mvn clean deploy 
```

### Maven Profiles

- Profiles can be used within maven to create customized build configurations within my project
- I can customize the behavior of a build based upon specific conditions
- e.g. I can skip the test execution due to the fact that my build process may take a long time
- I create a profile that will skip the test execution phase

#### How To Create

- Right below your build tag create a **profiles** tag

- Within your profiles tag create a **profile** tag I give it an:
	- *id*
	- *properties*

- After creating a profile for the above example Maven will make sure to skip the test execution

- I head over to the terminal and run the following command:
- -P flag indicates the id of the profile

```java
mvn -Pskip-tests clean install
```
