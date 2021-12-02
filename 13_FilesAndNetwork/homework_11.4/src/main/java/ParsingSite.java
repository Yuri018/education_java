import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class ParsingSite {

    ParsingSite(String path) {
        try {
            Document doc = Jsoup.connect(path).get();
            Elements newsHeadlines = doc.select("img");
            for (Element headline : newsHeadlines) {
                String umgUrl = headline.attr("abs:src");
                downloadImage(umgUrl);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void downloadImage (String str) {
        String imageName = str.substring(str.lastIndexOf("_"));
        try {
            InputStream in = new URL(str).openStream();
            Files.copy(in, Paths.get("homework_11.4/images" + "/" + imageName), REPLACE_EXISTING);
            in.close();
            System.out.println(imageName);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
