package com.ben;

import com.ben.util.FileWatcher;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(
        name = "watch",
        description = "Watch for changes"
)
public class WatchCommand implements Callable<Integer> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */

    @CommandLine.Parameters(index = "0", description = "Path to watch")
    private String path;

    @Override
    public Integer call() throws Exception {
        FileWatcher.watchDirectory(path);
        return 0;
    }
}
