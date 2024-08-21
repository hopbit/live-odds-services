package io.github.hopbit.scoreboard.lib.build;

import java.time.LocalDateTime;

public class BuildInfo {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String time = LocalDateTime.now().toString();
        System.out.println("********\nBuild Time: " + time
                + "\nJava Version: " + javaVersion + "\n********");
    }
}
