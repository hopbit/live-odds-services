Live Odds Services
==================

<!-- TODO: enable JavaCI, CodeQL and OpenSSF Scorecard
[![Java CI](https://github.com/hopbit/live-odds-services/actions/workflows/maven.yml/badge.svg)](https://github.com/hopbit/live-odds-services/actions/workflows/maven.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.hopbit/live-odds-services/badge.svg?gav=true)](https://maven-badges.herokuapp.com/maven-central/io.github.hopbit/live-odds-services/?gav=true)
[![CodeQL](https://github.com/hopbit/live-odds-services/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/hopbit/live-odds-services/actions/workflows/codeql-analysis.yml)
[![OpenSSF Scorecard](https://api.securityscorecards.dev/projects/github.com/hopbit/live-odds-services/badge)](https://api.securityscorecards.dev/projects/github.com/hopbit/live-odds-services)
-->

Live Odds Services is a simple library providing Live Football World Cup Score Board functionality. 

It was created as a coding exercise for a Sportradar company recruitment process.

The Project is heavily inspired by [Apache Commons Lang](https://github.com/apache/commons-lang) project and solution
created by [Ihor Zaiets](https://github.com/Ihor-Zaiets/live_odds_services) project. 

The code is tested using the latest revision of the JDK for supported
LTS releases: 8, 11, 17 and 21 currently.
<!-- TODO: set up maven ci cd using gh actions for jdk 8, 11, 17 and 21 -->
See https://github.com/hopbit/live-odds-services/blob/master/.github/workflows/maven.yml

Please ensure your build environment is up to date and kindly report any build issues.

Documentation
-------------

More information can be found under the [doc](https://commons.apache.org/proper/commons-lang) directory.
<!-- FIXME: publish Javadoc using this guide: https://vaadin.com/blog/host-your-javadoc-s-online-in-github -->
The [Javadoc](http://hopbit.github.io/live-odds-services) can be browsed. 
Questions related to the usage of Live Odds Services should be posted as the new issue with 
label `documentation` using [GitHub Issues](https://github.com/hopbit/live-odds-services/labels/documentation).

Getting the latest release
--------------------------

Warning: Library is not published yet. This will be performed 
as a part of [this issue](https://github.com/hopbit/live-odds-services/issues/5)

<!-- FIXME: enable a publishing library to Maven Central -->
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


Building
--------

Building requires the following tools: 
* Java JDK
* [Apache Maven](https://maven.apache.org/)
* [Lombok](https://projectlombok.org/download) 
  * _Look into section "Install" to find instructions for your specific environment_

The required Java version is found in the `pom.xml` as the `maven.compiler.source` property.

From a command shell, run `mvn` without arguments to invoke the default Maven goal to run all tests and checks.

Contributing
------------

We accept Pull Requests via GitHub. There is no developer mailing list. If you'd like to contact us, 
then please use GitHub Issues since it is the main channel of communication for contributors. 
If you have a nice idea then create an [enhancement](https://github.com/hopbit/live-odds-services/labels/enhancement) 
issue. If you found a bug then please create a [bug issue](https://github.com/hopbit/live-odds-services/labels/bug).  

There are some guidelines that will make applying PRs easier for us:
+ No tabs! Please use spaces for indentation.
+ Respect the existing code style for each file.
+ Create minimal diffs.
  Disable on save actions like reformat source code or organize imports. 
  If you feel the source code should be reformatted, create a separate PR for this change.
+ Provide JUnit tests for your changes and make sure your changes don't break any existing tests by running `mvn`.
+ Before you pushing a PR, run `mvn` (by itself), this runs the default goal, which contains all build checks.
+ To see the code coverage report, regardless of coverage failures, run `mvn clean site -Dcommons.jacoco.haltOnFailure=false`

You can learn more about contributing via GitHub in our [contribution guidelines](CONTRIBUTING.md).

License
-------
This code is licensed under the [Apache License v2](https://www.apache.org/licenses/LICENSE-2.0).

See the `NOTICE.txt` file for required notices and attributions.

Donating
--------
You like Live Odds Services? Then [buy me a vinyl](https://buymeacoffee.com/shivioua) 
to help me to extend [my collection](https://www.discogs.com/user/shivioua/collection?header=1&layout=big).

Additional Resources
--------------------

+ [Author's LinkedIn Profile](https://www.linkedin.com/in/lukasz-siwinski/)
+ [GitHub Issue Tracker](https://github.com/hopbit/live-odds-services/issues)
+ [Sportradar Official Website](https://sportradar.com)

Other people solutions
======================

Below are available links to the solutions of the same exercise that are available publicly on GitHub.

* ✔ ☕ https://github.com/Ihor-Zaiets/live_odds_services (java)
  * I have use it as an inspiration to do a quick draft of a Java-based solution
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

* ❌ https://github.com/austin-hart/internship-work (python) 
* ❌ https://github.com/Eghizio/sportradar (typescript/javascript)
* ❌ https://github.com/GsiorX/scalo-sportradar (php/docker)
* ❌ https://github.com/hifeamin/Sportradar.LiveOddsService (c#/docker/gherkin)
* ❌ https://github.com/jdekarske/football_odds (python) 🐍
* ❌ https://github.com/JTurner1405/Sportradar.Service.Recruitment (c#)
* ❌ https://github.com/mopielka/sportradar-scoreboard (js/typescript library)
  * Lib but written in JS/Typescript, might be worth looking into later on to take some inspiration how to set up a library. 

----
