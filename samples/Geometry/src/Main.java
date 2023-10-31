import models.cars.CarFunctionalities;
import models.cars.Corolla;
import models.geometry.AbstractShape;
import models.geometry.Circle;
import models.geometry.Shape;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void turnOnSomeVehicle(CarFunctionalities car) {
        car.turnOn();
        System.out.println("Success!");
    }

    public static void main(String[] args) {
        // codigo ruim = extender, entender e mudar
        Circle c = new Circle(1.0, "red", 5.0);

        AbstractShape s = new Circle(1.0, "blue", 3.0);
        Shape s2 = new Circle(2.0, "green", 4.0);

        List<Integer> integers = new ArrayList<>();

        turnOnSomeVehicle(new Corolla("123-abc", "2015"));
    }
}