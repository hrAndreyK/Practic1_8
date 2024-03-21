/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1.pkg8;
/* В программе создано 4, кейса первый кейс отвечает за добавление в список
new Auto. 2 кейс за удаление авто по его номеру. 3 кейс удаление всех авто.
4 выход из программы*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;


public class Task18 {
     public static void main(String[] args) {
        System.out.println("Хохлов Андрей РИБО-03-22");
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 2010, "ABC123"));
        carList.add(new Car("Honda", 2012, "DEF456"));
        carList.add(new Car("Ford", 2015, "GHI789"));
        //добавляем в список 3 новых машины( по умолчанию)

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add a new car");
            System.out.println("2. Remove a car by registration number");
            System.out.println("3. Remove all cars");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter brand: ");
                    String brand = scanner.next();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter registration number: ");
                    String regNumber = scanner.next();
                    boolean exists = false;
                    for (Car car : carList) {
                        if (car.regNumber.equals(regNumber)) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Car with this registration number already exists.");
                    } else {
                        carList.add(new Car(brand, year, regNumber));
                        System.out.println("Car added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter registration number of the car to remove: ");
                    String regNumToRemove = scanner.next();
                    carList.removeIf(car -> car.regNumber.equals(regNumToRemove));
                    System.out.println("Car removed successfully.");
                    break;

                case 3:
                    carList.clear(); //очистить список
                    System.out.println("All cars removed.");
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    return; // заканчивает выполнять действие и возвращает (-), выход из цикла

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nCurrent list of cars:");
            for (Car car : carList) {
                System.out.println(car); //выводит после каждого дейсивия авто
            }
        }
    }
}

