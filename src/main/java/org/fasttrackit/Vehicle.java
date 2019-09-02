package org.fasttrackit;

public class Vehicle {
    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " km/h " + durationInHours + " h. ");

        double distance = speed * durationInHours;
        System.out.println("Distance: " + distance);

        //same result as the above statement
        traveledDistance = traveledDistance + distance;
        //traveledDistance += distance;
        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel" + fuelLevel);

        //incrementing / decrementing + 1
//        fuelLevel = fuelLevel + 1;
//        fuelLevel +=1;
//        fuelLevel ++;
        return distance;
    }
}
