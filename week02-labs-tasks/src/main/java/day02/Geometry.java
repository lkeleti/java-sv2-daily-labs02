package day02;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.4, 3.5);
        System.out.println(rectangle.calculateArea());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Téglalap területe:");
        System.out.print("Kérem az a oldal hosszát: ");
        double sideA = scanner.nextDouble();
        scanner.hasNextLine();
        System.out.print("Kérem a b oldal hosszát : ");
        double sideB = scanner.nextDouble();
        scanner.hasNextLine();
        Rectangle anotherRectangle = new Rectangle(2.4, 3.5);
        System.out.printf("A %.2f * %.2f oldalú téglalap területe: %.2f", sideA, sideB, anotherRectangle.calculateArea());
    }
}
