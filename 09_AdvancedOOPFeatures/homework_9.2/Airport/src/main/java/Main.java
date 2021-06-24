import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        long currentTime = new Date().getTime();
        long departureNextTwoHours = 60 * 60 * 2 * 1000;

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
//                .map(Terminal::getFlights)
//                .flatMap(Collection::stream)
                .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE))
                .filter(time -> time.getDate().getTime() >= currentTime &&
                        time.getDate().getTime() <= currentTime + departureNextTwoHours)
                .collect(Collectors.toList());

    }
}