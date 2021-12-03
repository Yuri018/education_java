import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;


public class ParseImageLinks {
    public ParseImageLinks(String path) {
        try {
            Document document = Jsoup.connect(path)
                    .userAgent("Mozilla/5.0")
                    .timeout(10 * 1000)
                    .get();
            Elements imageElements = document.select("img");
            for (Element imageElement : imageElements) {
                String imageURL = imageElement.attr("abs:src");
                downloadImageLinks(imageURL);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void downloadImageLinks(String str) {

        String imageName = str.substring(str.lastIndexOf("_") + 1);
        try {
            URL url = new URL(str);
            InputStream inputStream = url.openStream();

            byte[] buffer = new byte[4096];
            int n;
            OutputStream outputStream = new FileOutputStream("homework_11.4/images"
                    + "/" + imageName);
            while ((n = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, n);
            }
            inputStream.close();
            outputStream.close();
            System.out.println(imageName);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
