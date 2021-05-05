package Chapter2Incapsulation.Pojo;

public class Country {

    private String name;
    private int population;
    private int square;
    private String capitalName;
    private boolean exitToSee;

    public Country(String name) {// конструктор
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isExitToSee() {
        return exitToSee;
    }

    public void setExitToSee(boolean exitToSee) {
        this.exitToSee = exitToSee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
