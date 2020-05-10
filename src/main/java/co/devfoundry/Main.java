package co.devfoundry;

import co.devfoundry.house.House;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        House house2 = new House.HouseBuilder()
                .buildDoors("doors")
                .buildFloors("Floors")
                .buildGarage("garage")
                .buildRoof("roof")
                .build();

        System.out.println(house2);


    }

}
