Contributing to Live Odds Services
======================

Have you found a bug or have an idea for a cool new feature? Contributing code is a great way to give something 
back to the open-source community. Before you dig right into the code, we need contributors to follow 
a few guidelines to have a chance of keeping on top of things.

Getting Started
---------------

+ Make sure you have a [GitHub account](https://github.com/signup/free). This is not essential, but makes providing patches much easier.
+ If you're planning to implement a new feature it makes sense to discuss your changes using [GitHub issue](https://github.com/hopbit/live-odds-services/labels/enhancement) 
first. This way you can make sure you're not wasting your time on something that isn't considered to 
be in Live Odds Services scope.
+ Submit a GitHub issue](https://github.com/hopbit/live-odds-services/labels/enhancement) for your enhancement, assuming 
one does not already exist.
    + Clearly describe the issue including steps to reproduce when it is a [bug](https://github.com/hopbit/live-odds-services/labels/bug).
    + Make sure you fill in the earliest version that you know has the issue.
+ Create a [fork](https://help.github.com/articles/fork-a-repo/) and check out your forked repository. If you don't 
have a GitHub account, you can still clone the Live Odds Services repository.

Making Changes
--------------

+ Create a _topic branch_ for your isolated work.
    * Usually you should base your branch on the `main` branch.
    * A good topic branch name can be the GitHub issue ID plus a keyword, e.g. `LOS-123-improve-country-validation`.
    * If you have submitted multiple GitHub issues, try to maintain separate branches and pull requests.
+ Make commits of logical units.
    * Make sure your commit messages are meaningful and in the proper format. Your commit message should contain 
      the key of the GitHub issue.
    * e.g. `LOS-123: Fix validation for Poland country`
+ Respect the original code style:
    + Only use spaces for indentation.
    + Create minimal diffs - disable _On Save_ actions like _Reformat Source Code_ or _Organize Imports_. 
      If you feel the source code should be reformatted create a separate PR for this change first.
    + Check for unnecessary whitespace with `git diff` -- check before committing.
+ Make sure you have added the necessary tests for your changes, typically in `src/test/java`.
+ Run all the tests with `mvn clean verify` to ensure nothing else was accidentally broken.

Making Trivial Changes
----------------------

<!-- TODO: GH issues should be used to generate changelog -->
The GitHub issues will be used to generate the changelog for the next release.

For changes of a trivial nature to comments and documentation, it is not always necessary to create a new issue 
in GitHub. In this case, it is appropriate to start the first line of a commit with '(doc)' instead of a issue number.


Submitting Changes
------------------

+ Push your changes to a topic branch in your fork of the repository.
+ Submit a _Pull Request_ on [GitHub](https://github.com/hopbit/live-odds-services/pulls).
    * Verify _Files Changed_ shows only your intended changes and does not
      include additional files like `target/*.class`, `*.jar`, etc.
+ Update your GitHub issue and link to the pull request in the issue.

If you prefer to not use GitHub, then you can instead use
`git format-patch` and attach the patch file to the GitHub issue.


Additional Resources
--------------------

+ [General GitHub documentation](https://help.github.com/)
+ [GitHub pull request documentation](https://help.github.com/articles/creating-a-pull-request/)
+ [Sportradar Official Website](https://sportradar.com)
