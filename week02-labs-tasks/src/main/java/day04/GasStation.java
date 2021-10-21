package day04;

public class GasStation {
    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int fuelingCar(Car car, int liter ) {
        car.setAmountOfFuel(liter);
        car.setTravelledDistance(0);
        return liter * price;
    }
}
