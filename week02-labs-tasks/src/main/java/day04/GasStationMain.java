package day04;

import java.util.Scanner;

public class GasStationMain {
    public static void main(String[] args) {
        Car volvo = new Car(20);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Az autóban induláskor %d liter üzemanyag van." + System.lineSeparator() , volvo.getAmountOfFuel());

        System.out.print("Kérem adja meg, hogy hány kilométert tett meg az induló üzemanyag mennyiséggel: ");
        int kms = scanner.nextInt();
        scanner.nextLine();
        volvo.setTravelledDistance(kms);

        System.out.printf("Az átlag fogyasztásunk %.2f liter/100km." + System.lineSeparator(), volvo.calcAverageConsumption() );

        System.out.println("Meg kell tankolni az autót, hogyha szeretnénk tovább utazni.");
        GasStation gasStation = new GasStation(508);
        System.out.printf("Hány liter üzemanyagot tankoljunk az autóba? Az üzemanyag ára: %d Ft/liter. ", gasStation.getPrice());
        int liters = scanner.nextInt();
        System.out.printf("Az üzemanyag ára összesen: %d Ft" + System.lineSeparator(), gasStation.fuelingCar(volvo, liters));
        System.out.printf("A tankolt üzemanyag mennyiséggel a korábbi átlagfogyasztás alapján megtehető körülbrlül %d km.", volvo.getRemainingDistance());
    }
}
