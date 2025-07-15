package com.ben;

import picocli.CommandLine;

@CommandLine.Command(
        name = "CodeFlowCopilot",
        mixinStandardHelpOptions = true,
        description = "Your Context-Aware AI Dev Buddy",
        subcommands = {
                WatchCommand.class
        }
)
public class Main implements Runnable{
    /**
     * Runs this operation.
     */

    public static void main(String[] args) {
        int existCode = new CommandLine(new Main()).execute(args);
        System.exit(existCode);

    }

    @Override
    public void run() {
        System.out.println("Welcome to CodeFlowCopilot!");
        System.out.println("Type `--help` to see available commands.");
        System.out.println("Use `--help` to see available commands.");
    }
}
