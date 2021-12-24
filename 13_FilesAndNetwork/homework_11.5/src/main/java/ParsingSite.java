import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParsingSite {

    ParsingSite(String path) {
        try {
            Document doc = Jsoup.connect(path).maxBodySize(0).get();
//            Elements selectLines = doc.select("span.js-metro-line");
//            for (Element link: selectLines){
//                String linesNum = link.attr("data-line");
//                System.out.println(linesNum + ". " + link.text());
//            }

            Elements selectStation = doc.select("span.name");
            for (Element link: selectStation){
                String stationNum = link.attr("span.name");
                System.out.println(link.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
