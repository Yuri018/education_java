import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ParsingSite {

    ParsingSite(String path) {
        try {
            Document doc = Jsoup.connect(path).get();
            String title = doc.text();
            System.out.println(title);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
