import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParsingSite {

    ParsingSite(String path) {
        try {
            Document doc = Jsoup.connect(path).get();
            String title = doc.title();
            System.out.println(title);

            Elements newsHeadlines = doc.select("img");
            for (Element headline : newsHeadlines) {
                System.out.printf("%s\n\t%s\n%s",
                        headline.attr("src"), headline.absUrl("href")
                        , headline.attr("h3.card-title"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
