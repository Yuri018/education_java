public class WordsRegexOut {
    public static void main(String[] args) {
        String text = "Earth Day turns 50 today. The original wave of coast-to-coast demonstrations in 1970 not only" +
                " transformed American priorities, leading to landmark legislation like the Clean Air Act, but helped" +
                " shape the modern global environmental movement. In the past half-century, air and water pollution" +
                " have plummeted in the United States, the bald eagle is no longer endangered, and environmental laws" +
                " pioneered in America have set a model for nations around the world. But since then, other threats" +
                " have grown, including climate change, tropical deforestation and a staggering loss of global" +
                " biodiversity. Here is a look at what’s gotten better and what’s gotten worse in the five decades" +
                " since millions of people marched to demand a cleaner, healthier environment.";

        String regex = "\\s*(\\s|,|!|\\.)\\s*";//составляем регулярное выражение
        String[] words = text.split(regex);//метод split() создает массив подстрок
        for (String x: words) {
            System.out.println(x);
        }
    }
}
