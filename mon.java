import java.util.Scanner;
class Vehicle 
{
    String Brand;
    int Year;

    void StartEngine() 
    {
        System.out.println("This is Vehicle");
    }
}

class Car extends Vehicle 
{
    String fuelType;

    @Override
    void StartEngine() 
    {
        System.out.println("Car engine starts");
    }

    void drive() 
    {
        System.out.println("Car is driving");
    }
}

class Truck extends Vehicle 
{
    int LoadCapacity; 
    @Override
    void StartEngine() 
    {
        System.out.println("Truck engine starts");
    }

    void haul() 
    {
        System.out.println("Truck is hauling");
    }
}

class Main { 
    public static void main(String[] args) {
        Truck t1 = new Truck();
        t1.StartEngine();
        t1.Year = 2023;
        t1.Brand = "xxx";
        t1.LoadCapacity = 1000; 
        t1.haul();

        Car car1 = new Car();
        car1.Brand = "Red car";
        car1.fuelType = "Petrol";
        car1.StartEngine(); 
        car1.drive();
    }
}