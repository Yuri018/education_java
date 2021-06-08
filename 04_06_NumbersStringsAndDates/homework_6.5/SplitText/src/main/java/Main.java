public class Main {

  public static void main(String[] args) {

//    String text = "Es sind Zahlen, die optimistisch stimmen. In den meisten Ländern Europas" +
//            " gehen die Zahlen der an oder mit Corona verstorbenen Menschen zurück, und zwar" +
//            " drastisch. Ausschlaggebend dafür ist die zunehmende Immunisierung der Bevölkerung," +
//            " insbesondere der älteren Menschen. Die Pandemie ist natürlich nicht vorbei. Aber" +
//            " vieles spricht dafür, dass Europa auf gutem Wege ist, den \"Endspurt\" einzuläuten," +
//            " Corona also absehbar in den Griff zu bekommen. \n" +
//            "\n" +
//            "Doch auf den zweiten Blick zeigt sich, dass nicht alle EU-Mitgliedsstaaten" +
//            " gleichermaßen an dieser positiven Entwicklung teilhaben. In Ländern wie Bulgarien," +
//            " Rumänien und der Slowakei sorgen geringe Impfraten und schwache Gesundheitssysteme" +
//            " weiterhin für höhere Sterberaten (siehe Grafik) als im Rest der EU.";

//    splitTextIntoWords(text);
  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String[] worldSplit = text.split("\\s*(\\s|,|!|\\.)\\s*");
    for (String world: worldSplit) {
      System.out.println(world);
    }
    return text;
  }

}