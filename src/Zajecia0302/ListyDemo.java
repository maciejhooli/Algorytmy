package Zajecia0302;

import java.util.ArrayList;

public class ListyDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Skoda");
        cars.add("VW");


        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        cars.remove(0);
        System.out.println("***********");
        for (String car:cars){
            System.out.println(car);
        }

        }

}
