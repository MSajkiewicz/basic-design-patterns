package co.devfoundry;

import co.devfoundry.flight.FlightLeg;
import co.devfoundry.house.House;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").price(50).build();
        System.out.println(leg);
    }

}
