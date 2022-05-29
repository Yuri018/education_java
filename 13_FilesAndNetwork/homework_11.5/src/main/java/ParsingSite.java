import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParsingSite {

    ParsingSite(String path) {

        try {
            parseLines(path);
            parseStations(path);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    //парсим номер и назавание линии
    public static void parseLines (String path) throws IOException {
        Document doc = Jsoup.connect(path).maxBodySize(0).get();
            Elements selectLines = doc.select("span.js-metro-line");
            for (Element link: selectLines){
                String linesNum = link.attr("data-line");
                System.out.println(linesNum + ". " + link.text());
            }
    }
    //парсим номер линии и название станций этой линии
    public static void parseStations (String path) throws IOException {
        Document doc = Jsoup.connect(path).maxBodySize(0).get();
        Elements selectStation = doc.select("div.js-metro-stations");
        for (Element link: selectStation){
            String linesNum = link.attr("data-line");
            Elements stationName = link.select("span.name");
            System.out.println(linesNum + ". " + stationName.text());
        }
    }
}
