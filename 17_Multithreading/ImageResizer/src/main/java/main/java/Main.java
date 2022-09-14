package main.java;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int newWidth = 300;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String srcFolder = "ImageResizer/data/src";
        String dstFolder = "ImageResizer/data/dst";

        File srcDir = new File(srcFolder);

        File[] files = srcDir.listFiles();

        int processorsCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processorsCount);
        assert files != null;
        for(File file : files){
            executor.submit(new ImageResizer(files, newWidth, dstFolder, start));
        }
        executor.shutdown();
    }
}
