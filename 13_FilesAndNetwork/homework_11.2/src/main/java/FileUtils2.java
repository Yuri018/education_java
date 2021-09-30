import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUtils2 {

    public static void copyFolder(String sourceDirectory, String destinationDirectory) {

        Path srcDir = Paths.get(sourceDirectory);
        Path destDir = Paths.get(destinationDirectory);

        File[] listOfFiles = srcDir.toFile().listFiles();
        assert listOfFiles != null;
        for (File file : listOfFiles) {
            if (file.isDirectory()) {
                copyFolder(file.getPath(), createNewFolder(file, destDir).getPath());
            } else {
                try {
                    Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private static File createNewFolder(File folder, Path destDir) {
        File newFolder = new File(destDir.toFile(), folder.getName());
        newFolder.mkdir();
        return newFolder;
    }
}

