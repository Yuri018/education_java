import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) {
        // TODO: write code copy content of sourceDirectory to destinationDirectory

        File srcDir = new File(sourceDirectory);
        File destDir = new File(destinationDirectory);
        try {
            org.apache.commons.io.FileUtils.copyDirectory(srcDir, destDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //zweite variante
        File folder = new File(sourceDirectory);
        File[] listOfFiles = folder.listFiles();

        Path newDir = Paths.get(destinationDirectory);
        if (listOfFiles != null)
            for (File file : listOfFiles)
                try {
                    Files.copy(file.toPath(), newDir.resolve(file.getName())
                            , StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
    }
}
