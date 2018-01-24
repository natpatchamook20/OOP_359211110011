package ooplab7;

import java.util.Scanner;

public class MySuperCar {
    public static void main(String[] args) {
        SuperCar car1 = new SuperCar();
        car1.setCarBrand("Vios");
        car1.setCarColor("Red");
        car1.setCarEngineSize("1111");
        car1.setMaxSpeed("4444444");

        System.out.println(car1.getCarBrand());
        System.out.println(car1.getMaxSpeed());

        System.out.println(car1.toString());

        SuperCar car2 = new SuperCar();
        car2 = inputData(car2);
        System.out.println(car2.toString());
    }

    private static SuperCar inputData(SuperCar car) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car info: ");
        System.out.print("Enter car brand: ");
        car.setCarBrand(scanner.nextLine());


        System.out.print("Enter car color: ");
        car.setCarColor(scanner.nextLine());

        System.out.print("Enter car Engine Size: ");
        car.setCarEngineSize(scanner.nextLine());

        System.out.print("Enter car maxSpeed: ");
        car.setMaxSpeed(scanner.nextLine());

        System.out.print("Enter car Country Of Origin: ");
        car.setCountryOfOrigin(scanner.nextLine());


        return car;
    }

}