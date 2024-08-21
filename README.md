Live Odds Services
==================

<!-- TODO: enable JavaCI, CodeQL and OpenSSF Scorecard
[![Java CI](https://github.com/hopbit/live-odds-services/actions/workflows/maven.yml/badge.svg)](https://github.com/hopbit/live-odds-services/actions/workflows/maven.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.hopbit/live-odds-services/badge.svg?gav=true)](https://maven-badges.herokuapp.com/maven-central/io.github.hopbit/live-odds-services/?gav=true)
[![CodeQL](https://github.com/hopbit/live-odds-services/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/hopbit/live-odds-services/actions/workflows/codeql-analysis.yml)
[![OpenSSF Scorecard](https://api.securityscorecards.dev/projects/github.com/hopbit/live-odds-services/badge)](https://api.securityscorecards.dev/projects/github.com/hopbit/live-odds-services)
-->

Live Odds Services is a simple library providing Live Football World Cup Score Board functionality. 

Project as for now is providing a basic functionality and is under active development. More changes are planned to come. 

It was created as a coding exercise for a Sportradar company recruitment process.

The Project is heavily inspired by [Apache Commons Lang](https://github.com/apache/commons-lang) project and solution
created by [Ihor Zaiets](https://github.com/Ihor-Zaiets/live_odds_services) project. 

Library follows standard maven project layout: 
* code can be browsed under `src` directory
* project configuration can be viewed in `pom.xml`

The code is currently tested using JDK8.
Please ensure your build environment is up to date and kindly report any build issues.hih 

It is planned to support other JDK versions as well - 11, 17 and 21. More
information available [here](https://github.com/hopbit/live-odds-services/issues/11).

<!-- TODO: set up maven ci cd using gh actions for jdk 8, 11, 17 and 21 
See https://github.com/hopbit/live-odds-services/blob/master/.github/workflows/maven.yml
-->

----

## Documentation

To be able to use this library, you need to perform a few steps upfront:
- Install prerequisite software.
- Clone this repository to your local machine.
- Build and install a library in local maven repository.  

If you will encounter any problems following below instructions then please 
create [an issue with label help wanted](https://github.com/hopbit/live-odds-services/labels/help%20wanted)
and describe your problem, so we can help you resolve it. 

### Install prerequisite software

To be able to build the library locally, please install the following software:
* [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
* [Java JDK](https://www.oracle.com/in/java/technologies/downloads/)
* [Apache Maven](https://maven.apache.org/install.html)
<!-- 
* [Lombok](https://projectlombok.org/download)
  * _Look into section "Install" to find instructions for your specific environment_
-->

The required Java version can be found in the [pom.xml file](https://github.com/hopbit/live-odds-services/blob/main/pom.xml#L47)
under the `maven.compiler.source` property.

To check if the above software is installed successfully, please check the output of the following commands 
in your terminal:

```shell
user@host MSYS /c/users/user
$ git --version
git version 2.45.0.windows.1

user@host MSYS /c/users/user 
$ java -version
openjdk version "1.8.0_392"
OpenJDK Runtime Environment (build 1.8.0_392-b08)
OpenJDK 64-Bit Server VM (build 25.392-b08, mixed mode)
user@host MSYS /c/users/user

$ mvn -version
Apache Maven 3.9.8 (36645f6c9b5079805ea5009217e36f2cffd34256)
Maven home: C:\apps\mvn\3.9.8
Java version: 1.8.0_392, vendor: Red Hat, Inc., runtime: C:\apps\java\jdk8\jre
Default locale: pl_PL, platform encoding: Cp1250
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

If the output is similar, you're ready to go to the next step. 

### Clone library repository

```shell
git clone https://github.com/hopbit/live-odds-services.git
````

You should see output similar to below: 

```shell
user@host MSYS /c/users/user 
$ git clone https://github.com/hopbit/live-odds-services.git
Cloning into 'live-odds-services'...
remote: Enumerating objects: 134, done.
remote: Counting objects: 100% (134/134), done.
remote: Compressing objects: 100% (69/69), done.
remote: Total 134 (delta 43), reused 115 (delta 32), pack-reused 0 (from 0)
Receiving objects: 100% (134/134), 47.68 KiB | 1.29 MiB/s, done.
Resolving deltas: 100% (43/43), done.
```

### Build and install a library

<!-- From a command shell, run `mvn` without arguments to invoke the default Maven goal to run all tests and checks.-->
From terminal run command `mvn install`.
This will run all checks, build and install a library in your local M2_HOME repository
(e.g. `/c/Users/user/.m2/repository/io/github/hopbit/live-odds-services`).
You should see output similar to below: 

```shell
bit@hopbit-thinkpad MSYS /c/Users/user/live-odds-services (main)
$ mvn install -P java-1.8
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< io.github.hopbit:live-odds-services >-----------------
[INFO] Building Live Odds Services 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ live-odds-services ---
[INFO] skip non existing resourceDirectory c:\Users\user\live-odds-services\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ live-odds-services ---
[WARNING]  Parameter 'compilerVersion' (user property 'maven.compiler.compilerVersion') is deprecated: This parameter is no longer evaluated by the underlying compilers, instead the actual version of the javac binary is automatically retrieved.
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ live-odds-services ---
[INFO] Copying 1 resource from src\test\resources to target\test-classes
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ live-odds-services ---
[WARNING]  Parameter 'compilerVersion' (user property 'maven.compiler.compilerVersion') is deprecated: This parameter is no longer evaluated by the underlying compilers, instead the actual version of the javac binary is automatically retrieved.
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- surefire:3.3.1:test (default-test) @ live-odds-services ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running io.github.hopbit.scoreboard.lib.model.MatchTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.172 s -- in io.github.hopbit.scoreboard.lib.model.MatchTest
[INFO] Running io.github.hopbit.scoreboard.lib.model.ScoreTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.010 s -- in io.github.hopbit.scoreboard.lib.model.ScoreTest
[INFO] Running io.github.hopbit.scoreboard.lib.operations.ScoreboardTest
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.064 s -- in io.github.hopbit.scoreboard.lib.operations.ScoreboardTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] 
[INFO] --- jar:3.4.2:jar (default-jar) @ live-odds-services ---
[INFO] Building jar: c:\Users\user\live-odds-services\target\live-odds-services-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] >>> javadoc:3.8.0:javadoc (create-javadoc-jar) > generate-sources @ live-odds-services >>>
[INFO]
[INFO] <<< javadoc:3.8.0:javadoc (create-javadoc-jar) < generate-sources @ live-odds-services <<<
[INFO]
[INFO]
[INFO] --- javadoc:3.8.0:javadoc (create-javadoc-jar) @ live-odds-services ---
[INFO] Configuration changed, re-generating javadoc.
[INFO] 
[INFO] --- javadoc:3.8.0:jar (create-javadoc-jar) @ live-odds-services ---
[INFO] Configuration changed, re-generating javadoc.
[INFO] Building jar: c:\Users\user\live-odds-services\target\live-odds-services-0.0.1-SNAPSHOT-javadoc.jar
[INFO] 
[INFO] --- jar:3.4.2:test-jar (default) @ live-odds-services ---
[INFO] Building jar: c:\Users\user\live-odds-services\target\live-odds-services-0.0.1-SNAPSHOT-tests.jar
[INFO] 
[INFO] --- install:3.1.2:install (default-install) @ live-odds-services ---
[INFO] Installing c:\Users\user\live-odds-services\pom.xml to C:\Users\user\.m2\repository\io\github\hopbit\live-odds-services\0.0.1-SNAPSHOT\live-odds-services-0.0.1-SNAPSHOT.pom
[INFO] Installing c:\Users\user\live-odds-services\target\live-odds-services-0.0.1-SNAPSHOT.jar to C:\Users\user\.m2\repository\io\github\hopbit\live-odds-services\0.0.1-SNAPSHOT\live-odds-services-0.0.1-SNAPSHOT.jar
[INFO] Installing c:\Users\user\live-odds-services\target\live-odds-services-0.0.1-SNAPSHOT-javadoc.jar to C:\Users\user\.m2\repository\io\github\hopbit\live-odds-services\0.0.1-SNAPSHOT\live-odds-services-0.0.1-SNAPSHOT-javadoc.jar
[INFO] Installing c:\Users\user\live-odds-services\target\live-odds-services-0.0.1-SNAPSHOT-tests.jar to C:\Users\user\.m2\repository\io\github\hopbit\live-odds-services\0.0.1-SNAPSHOT\live-odds-services-0.0.1-SNAPSHOT-tests.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  16.102 s
[INFO] Finished at: 2024-08-21T16:47:21+02:00
[INFO] ------------------------------------------------------------------------
```

<!-- TODO: Create proper Javadocs: https://github.com/hopbit/live-odds-services/issues/12
More information can be found under [doc](https://commons.apache.org/proper/commons-lang) directory.
The [Javadoc](http://hopbit.github.io/live-odds-services) can be browsed.
-->

### Usage 

If you executed all above steps successfully, then you should be able to start using library by adding it as 
a maven dependency to your local project: 

```xml
    <dependencies>
        <dependency>
            <groupId>io.github.hopbit</groupId>
            <artifactId>live-odds-services</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
    </dependencies>
```


```java
import io.github.hopbit.scoreboard.lib.model.Match;
import io.github.hopbit.scoreboard.lib.model.Score;
import io.github.hopbit.scoreboard.lib.model.enums.Country;
import io.github.hopbit.scoreboard.lib.operations.Scoreboard;
import java.time.LocalDateTime;

public class ScoreboardDemo {
    public static void main(String[] args) {

        // Create a new Scoreboard
        Scoreboard scoreboard = new Scoreboard();

        // Create matches
        LocalDateTime localDateTime = LocalDateTime.now();
        Match matchMexicoCanada = scoreboard.startMatch(Country.MEXICO, Country.CANADA);
        matchMexicoCanada.setScore(new Score(0, 5));
        matchMexicoCanada.setStartDate(localDateTime.plusSeconds(1));
        Match matchSpainBrazil = scoreboard.startMatch(Country.SPAIN, Country.BRAZIL);
        matchSpainBrazil.setScore(new Score(10, 2));
        matchSpainBrazil.setStartDate(localDateTime.plusSeconds(2));
        Match matchGermanyFrance = scoreboard.startMatch(Country.GERMANY, Country.FRANCE);
        matchGermanyFrance.setScore(new Score(2, 2));
        matchGermanyFrance.setStartDate(localDateTime.plusSeconds(3));
        Match matchUruguayItaly = scoreboard.startMatch(Country.URUGUAY, Country.ITALY);
        matchUruguayItaly.setScore(new Score(6, 6));
        matchUruguayItaly.setStartDate(localDateTime.plusSeconds(4));
        Match matchArgentinaAustralia = scoreboard.startMatch(Country.ARGENTINA, Country.AUSTRALIA);
        matchArgentinaAustralia.setScore(new Score(3, 1));
        matchArgentinaAustralia.setStartDate(localDateTime.plusSeconds(5));

        // Finish match
        scoreboard.finishMatch(matchUruguayItaly);

        System.out.println("----------------------------------------------");
        System.out.println("Home Team Score\t\t-\t\tAway Team Score");
        System.out.println("----------------------------------------------");
        
        // Print Matches
        for (Match m : scoreboard.getScoreboardMatchList()) {
            System.out.println(m.getHomeTeam() + " " +
                    m.getScore().getHomeTeamScore() + "\t\t\t-\t\t" +
                    m.getScore().getAwayTeamScore() + " " +
                    m.getAwayTeam()
            );
        }

    }
}
```

<!-- FIXME: enable a publishing library to Maven Central 
### Getting the latest release

**‼ Warning ‼** Library is not published yet. This will be performed 
in [this issue](https://github.com/hopbit/live-odds-services/issues/5).  

The preferred way to use it in your project is by including it into your dependencies :

**Apache Maven** 

```xml
<dependency>
  <groupId>io.github.hopbit</groupId>
  <artifactId>live-odds-services</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

**Apache Ivy**
```xml
<dependency org="io.github.hopbit" name="live-odds-services" rev="0.0.1-SNAPSHOT">
  <artifact name="live-odds-services" type="jar" />
</dependency>
```

**Groovy Grape**

```groovy
@Grapes([
@Grab(group='io.github.hopbit', module='live-odds-services', version='0.0.1-SNAPSHOT')
])
class Example {
    // 
}
```

**Gradle/Grails**
```groovy
implementation 'io.github.hopbit:live-odds-services:0.0.1-SNAPSHOT'
```

**Scala SBT**

```scala
libraryDependencies += "io.github.hopbit" % "live-odds-services" % "0.0.1-SNAPSHOT"
```

**Leiningen**

```clojure
[io.github.hopbit/live-odds-services "0.0.1-SNAPSHOT"]
```

Alternatively, you can download source and binaries from [GitHub download page](https://github.com/hopbit/live-odds-services/releases). 
After downloading, you need to put it on your classpath. 
-->

----

## Contributing

We accept Pull Requests via GitHub. There is no developer mailing list. If you'd like to contact us, 
then please use GitHub Issues since it is the main channel of communication for contributors. 
If you have a nice idea, then create an [enhancement](https://github.com/hopbit/live-odds-services/labels/enhancement) 
issue. If you find a bug, then please create a [bug issue](https://github.com/hopbit/live-odds-services/labels/bug).  

There are some guidelines that will make applying PRs easier for us:
+ No tabs! Please use spaces for indentation.
+ Respect the existing code style for each file.
+ Create minimal diffs.
  Disable on save actions like reformat source code or organize imports. 
  If you feel the source code should be reformatted, create a separate PR for this change.
+ Provide JUnit tests for your changes and make sure your changes don't break any existing tests by running `mvn`.
+ Before creating a PR, run `mvn` (by itself), this runs the default goal, which contains all build checks.
+ To see the code coverage report, regardless of coverage failures, run `mvn clean site -Dcommons.jacoco.haltOnFailure=false`

You can learn more about contributing via GitHub in our [contribution guidelines](CONTRIBUTING.md).

## License

This code is licensed under the [Apache License v2](https://www.apache.org/licenses/LICENSE-2.0).

See the `NOTICE.txt` file for required notices and attributions.

## Donating

You like Live Odds Services? Then [buy me a vinyl](https://buymeacoffee.com/shivioua) 
to help me to extend [my collection](https://www.discogs.com/user/shivioua/collection?header=1&layout=big).

## Additional Resources

+ [Author's LinkedIn Profile](https://www.linkedin.com/in/lukasz-siwinski/)
+ [GitHub Issue Tracker](https://github.com/hopbit/live-odds-services/issues)
+ [Sportradar Official Website](https://sportradar.com)

## Other people solutions

Below are available links to the solutions of the same exercise that are available publicly on GitHub.

* ✔ ☕ https://github.com/Ihor-Zaiets/live_odds_services (java)
  * I have used it as an inspiration to do a quick draft of a Java-based solution
* ☕ https://github.com/jlasalle/Sportradar_ScoreBoard
  * Another Java solution might be worth investigating as well
* ☕ https://github.com/jlasalle/Sportradar_ScoreBoard_OLD
  * Another Java solution might be worth investigating as well
* ☕ https://github.com/Parodix007/SportRadar-Task (java)
  * Another Java solution might be worth investigating as well
* ☕ https://github.com/Piachsecki/SportRadarProject (java)
  * Spring boot service, with Gradle build, might be a nice middleware inspiration.
* 🌍 https://github.com/janszarwaryn/live-scoreboard (js/css/html)
  * Might be a good idea to use as a template for frontend module ([live demo](http://live-scoreboard.jspace.pl/))
* 🌍 https://github.com/Taoo111/SportradarCodingAcademy (js/html/css)
  * Might be a good inspiration for crating frontend module.
* 🌍 https://github.com/mopielka/sportradar-scoreboard (js/typescript library)
  * Lib but written in JS/Typescript, might be worth looking into later on to take some inspiration how to set up a library.

<!--
* ❌ https://github.com/austin-hart/internship-work (python) 
* ❌ https://github.com/Eghizio/sportradar (typescript/javascript)
* ❌ https://github.com/GsiorX/scalo-sportradar (php/docker)
* ❌ https://github.com/hifeamin/Sportradar.LiveOddsService (c#/docker/gherkin)
* ❌ https://github.com/jdekarske/football_odds (python) 🐍
* ❌ https://github.com/JTurner1405/Sportradar.Service.Recruitment (c#)
-->

----
