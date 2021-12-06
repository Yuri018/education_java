import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class ParsingImageSite {

    ParsingImageSite(String path) {
        System.out.printf("%s %s\n", "Parsing site images", path);
        try {
            Document doc = Jsoup.connect(path).get();
            Elements selectLinks = doc.select("img");
            for (Element link : selectLinks) {
                String umgUrl = link.attr("abs:src");
                downloadImage(umgUrl);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void downloadImage(String str) {
        String imageName = str.substring(str.lastIndexOf("_") + 1);
        //Validierung von Bilddateinamen hinzufügen
        if (isFileName(imageName)) {
            //füge Try-with-Ressourcen hinzu, um Ressourcen automatisch zu schließen
            try (InputStream in = new URL(str).openStream()) {
                Files.copy(in, Paths.get("homework_11.4/images" + "/" + imageName), REPLACE_EXISTING);
                System.out.println(imageName);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    public boolean isFileName(String name) {
        Pattern pattern = Pattern.compile("([^s]+(.(?i)(jpg|png|gif|bmp|tiff))$)");
        return pattern.matcher(name).find();
    }
}

