import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;


public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) {

        //Kopieren von Verzeichnissen und Dateien mit Stream API
        Path srcDir = Paths.get(sourceDirectory);
        Path destDir = Paths.get(destinationDirectory);

        if (!destDir.toFile().exists())
            destDir.toFile().mkdirs();

        try (Stream<Path> stream = Files.walk(srcDir)) {
            stream.forEach(source -> copy(source, destDir.resolve(srcDir.relativize(source))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(Path source, Path dest) {
        try {
            Files.copy(source, dest);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        //Kopieren von Verzeichnissen und Dateien mit org.apache.commons.io
//        File srcDir = new File(sourceDirectory);
//        File destDir = new File(destinationDirectory);
//        try {
//            org.apache.commons.io.FileUtils.copyDirectory(srcDir, destDir);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        //Kopieren von Verzeichnissen und Dateien mit API java.nio
//        try {
//            Files.walk(Paths.get(sourceDirectory))
//                    .forEach(source -> {Path destination = Paths
//                            .get(destinationDirectory, source.toString()
//                                    .substring(sourceDirectory.length()));
//
//                        try {
//                            Files.copy(source, destination);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    });
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }
}

