package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Pros
            //You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
            //You can clone objects without coupling to their concrete classes.
        //Cons
            //Cloning complex objects that have circular references might be very tricky.


        //Create instances
        SportCar sportCar = new SportCar();
        sportCar.setAge(4);
        sportCar.setModel("Porsche");
        sportCar.setTurbo(true);

        SuvCar suvCar = new SuvCar();
        suvCar.setAge(9);
        suvCar.setModel("Ford");
        suvCar.setExtraHeadLamp(true);

        //Just created basic List of Cars
        List<Car> cars = new ArrayList<>();
        cars.add(sportCar);
        cars.add(suvCar);

        //Prototype Clone example
        List<Car> clonedCars = new ArrayList<>();
        for (Car car : cars) {
            clonedCars.add(car.clone());
        }

        //Show both car list
        System.out.println("Cars: ");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("\n\n Cloned Cars: ");
        for (Car car : clonedCars) {
            System.out.println(car);
        }
    }
}
