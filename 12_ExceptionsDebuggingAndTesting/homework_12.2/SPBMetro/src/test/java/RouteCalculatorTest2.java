import core.Line;
import core.Station;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest2 {

    private final double delta = 1e-9;
    StationIndex stationIndex;
    RouteCalculator routeCalculator;

    @Before
    public void createSchemeForTest() {
        Line line1 = new Line(1, "1");
        Line line2 = new Line(2, "2");
        Line line3 = new Line(3, "3");

        Station station1 = new Station("Девяткино", line1);
        Station station2 = new Station("Чернышевская", line1);
        Station station3 = new Station("Балтийская", line1);
        Station station4 = new Station("Парнас", line2);
        Station station5 = new Station("Автово", line2);
        Station station6 = new Station("Нарвская", line2);
        Station station7 = new Station("Обводный канал", line3);
        Station station8 = new Station("Чкаловская", line3);
        Station station9 = new Station("Достоевская", line3);

        line1.addStation(station1);
        line1.addStation(station2);
        line1.addStation(station3);
        line2.addStation(station4);
        line2.addStation(station5);
        line2.addStation(station6);
        line3.addStation(station7);
        line3.addStation(station8);
        line3.addStation(station9);

        List<Station> connection1 = new ArrayList<>();
        connection1.add(station1);
        connection1.add(station4);

        List<Station> connection2 = new ArrayList<>();
        connection2.add(station6);
        connection2.add(station9);

        stationIndex = new StationIndex();

        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);
        stationIndex.addStation(station7);
        stationIndex.addStation(station8);
        stationIndex.addStation(station9);

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        stationIndex.addConnection(connection1);
        stationIndex.addConnection(connection2);

        routeCalculator = new RouteCalculator(stationIndex);
    }

    @Test
    public void testRouteCalculatorWithOneLine() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.
                getStation("Девяткино"), stationIndex.getStation("Балтийская"));
        Assert.assertEquals(3, actual.size(), delta);
    }

    @Test
    public void testRouteCalculatorWithTwoLine(){
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.
                getStation("Чернышевская"), stationIndex.getStation("Автово"));
        Assert.assertEquals(4, actual.size(), delta);
    }

    @Test
    public void testRouteCalculatorWithThreeLine(){
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.
                getStation("Чернышевская"), stationIndex.getStation("Чкаловская"));
        Assert.assertEquals(7, actual.size(), delta);
    }

    @Test
    public void testCalculateDuration(){
        List<Station> route = routeCalculator.getShortestRoute(stationIndex.
                getStation("Чернышевская"), stationIndex.getStation("Чкаловская"));
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 17.0;
        Assert.assertEquals(expected, actual, delta);
    }
}
