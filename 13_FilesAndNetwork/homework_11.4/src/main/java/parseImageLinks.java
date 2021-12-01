import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class parseImageLinks {
    String imageURL = "";
    public parseImageLinks(String path) {
        try {
            Document document = Jsoup.connect(path).get();
            Elements imageElements = document.select("img");
            for (Element imageElement: imageElements) {
                imageURL = imageElement.attr("abs:src");
                downloadImageLinks(imageURL);
                System.out.println(imageURL);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void downloadImageLinks (String str) throws IOException {
        Files.writeString(Paths.get("homework_11.4/images/links.html"), str);
    }
}
