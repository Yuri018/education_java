import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;


public class parseImageLinks {
//    String imageURL = "";
    public parseImageLinks(String path) {
        try {
            Document document = Jsoup.connect(path)
                    .userAgent("Mozilla/5.0")
                    .timeout(10 * 1000)
                    .get();
            Elements imageElements = document.select("img");
            for (Element imageElement: imageElements) {
                String imageURL = imageElement.attr("abs:src");
                downloadImageLinks(imageURL);
//                System.out.println(imageURL);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void downloadImageLinks (String str) {

        String imageName = str.substring(str.lastIndexOf("/") + 1);

        try {
            URL url = new URL(str);
            InputStream inputStream = url.openStream();

            byte[] buffer = new byte[4096];
            int n;
            OutputStream outputStream = new FileOutputStream("homework_11.4/images"
            + "/" + imageName);
            while ((n = inputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0, n);
            }
            outputStream.close();
            System.out.println(imageName);

        } catch (Exception ex){
            ex.printStackTrace();
        }
//        Files.writeString(Paths.get("homework_11.4/images/links.html"), imageName);
    }
}
