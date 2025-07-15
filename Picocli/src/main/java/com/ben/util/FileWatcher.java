package com.ben.util;

import java.io.IOException;
import java.nio.file.*;

public class FileWatcher {


    public static void watchDirectory(String dirPath) {
        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();
            Path path = Paths.get(dirPath);
            path.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY,
                    StandardWatchEventKinds.ENTRY_DELETE);

            System.out.println("🔍 Watching directory: " + dirPath);
            WatchKey key;
            while ((key = watchService.take()) != null) {
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println("📦 Event kind:" + event.kind() +
                            ". File affected: " + event.context());
                }
                key.reset();
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("❌ Error watching directory: " + e.getMessage());
        }
    }
}
