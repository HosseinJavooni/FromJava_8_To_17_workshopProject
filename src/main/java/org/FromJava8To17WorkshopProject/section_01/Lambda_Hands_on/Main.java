package org.FromJava8To17WorkshopProject.section_01.Lambda_Hands_on;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String...args) {
        List<Car> cars = Arrays.asList(new Car(500, BRAND.MARUTI),
                                        new Car(1000, BRAND.BMW),
                                        new Car(700, BRAND.TATA),
                                        new Car(200, BRAND.MARUTI));

        //Solution below this line
        printDynamically(cars, car -> System.out.println(car.getWeight()));
        printDynamically(cars, car -> {
            if (car.getCarBrand().equals(BRAND.MARUTI)) {
                System.out.println(car.getWeight() + " and brand is "+ car.getCarBrand());
            }
        });
    }

    //with our defined functional interface (in this case CarPrinter)
//    public static void printDynamically(List<Car> cars, CarPrinter printer) {
//        for (Car car : cars) {
//            printer.print(car);
//        }
//    }

//     with Java built in functional interface (in this case Consumer<T>)
    public static void printDynamically(List<Car> cars, Consumer<Car> printer) {
        for (Car car : cars) {
            printer.accept(car);
        }
    }
}
