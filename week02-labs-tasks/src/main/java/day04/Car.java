package day04;

public class Car {
    private int amountOfFuel;
    private int travelledDistance;
    private double averageConsumption;

    public Car(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(int travelledDistance) {
        this.travelledDistance = travelledDistance;
    }

    public double calcAverageConsumption() {
        if (amountOfFuel == 0 || travelledDistance == 0) {
            return -1;
        }
        else {
            averageConsumption = (((double)amountOfFuel) / travelledDistance) * 100;
            return averageConsumption;
        }
    }

    public int getRemainingDistance() {
        return (int)(amountOfFuel / averageConsumption * 100);
    }
}
