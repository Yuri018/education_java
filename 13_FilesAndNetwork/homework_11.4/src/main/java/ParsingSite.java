import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParsingSite {

    ParsingSite(String path) {
        List<String> umgUrl = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(path).get();
            Elements newsHeadlines = doc.select("img");
            for (Element headline : newsHeadlines) {
//                System.out.printf("%s\n\t%s",
//                        headline.attr("src"), headline.absUrl("href"));
                umgUrl.add(headline.attr("abs:src"));

                Files.write(Paths.get("homework_11.4/images/links.html"), umgUrl);
                System.out.println(umgUrl);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
