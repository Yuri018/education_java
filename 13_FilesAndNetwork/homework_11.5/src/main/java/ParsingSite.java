import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParsingSite {

    ParsingSite(String path) {
        try {
            Document doc = Jsoup.connect(path).maxBodySize(0).get();
            Elements selectLinks = doc.select("metrodata");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
