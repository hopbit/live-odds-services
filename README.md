Live Odds Services
==================

<!-- TODO: enable JavaCI, CodeQL and OpenSSF Scorecard
[![Java CI](https://github.com/hopbit/live-odds-services/actions/workflows/maven.yml/badge.svg)](https://github.com/hopbit/live-odds-services/actions/workflows/maven.yml)
[![CodeQL](https://github.com/hopbit/live-odds-services/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/hopbit/live-odds-services/actions/workflows/codeql-analysis.yml)
[![OpenSSF Scorecard](https://api.securityscorecards.dev/projects/github.com/hopbit/live-odds-services/badge)](https://api.securityscorecards.dev/projects/github.com/hopbit/live-odds-services)
-->

Live Odds Services is a simple library providing Live Football World Cup Score Board functionality. 

It was created as a coding exercise for a Sportradar company recruitment process.

Project structure is heavily inspired by Apache Commons Lang project. 

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
You can download source and binaries from our [download page](https://github.com/hopbit/live-odds-services/releases).

<!-- FIXME: enable a publishing library to Maven Central -->
Alternatively, you can pull it from the central Maven repositories:

```xml
<dependency>
  <groupId>com.sportradar</groupId>
  <artifactId>live-odds-services</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

Building
--------

Building requires a Java JDK and [Apache Maven](https://maven.apache.org/).
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

Other solutions of the same exercise available on GitHub:

* https://github.com/austin-hart/internship-work
* https://github.com/Eghizio/sportradar
* https://github.com/GsiorX/scalo-sportradar
* https://github.com/hifeamin/Sportradar.LiveOddsService
* https://github.com/Ihor-Zaiets/live_odds_services
* https://github.com/janszarwaryn/live-scoreboard
* https://github.com/jdekarske/football_odds
* https://github.com/jlasalle/Sportradar_ScoreBoard
* https://github.com/jlasalle/Sportradar_ScoreBoard_OLD
* https://github.com/JTurner1405/Sportradar.Service.Recruitment
* https://github.com/mopielka/sportradar-scoreboard
* https://github.com/Parodix007/SportRadar-Task
* https://github.com/Taoo111/SportradarCodingAcademy
* https://github.com/Piachsecki/SportRadarProject
