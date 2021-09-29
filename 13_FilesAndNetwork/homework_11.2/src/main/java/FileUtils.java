import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) {
        //Kopieren von Verzeichnissen und Dateien mit commons.io
        File srcDir = new File(sourceDirectory);
//        File[] listOfFiles = srcDir.listFiles();
        File destDir = new File(destinationDirectory);
        if(srcDir.isDirectory()){
            if(!destDir.exists()){
                destDir.mkdir();
            }

            String files[] = srcDir.list();

            for (String file : files) {
                File srcFile = new File(srcDir, file);
                File destFile = new File(destDir, file);

                copyFolder(srcFile.toString(), destFile.toString());
            }
        }

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
        //Kopieren von Verzeichnissen und Dateien mit java.io API
    }
    }

