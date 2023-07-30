import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        House house = new House();

        System.out.println("write your plan number ");
        int floor = scanner.nextInt();
        scanner.nextLine();


        System.out.println("write address ");
        String address = scanner.nextLine();


        System.out.println("write the names of the residents separated by commas");
        String resident = scanner.nextLine();
        String[] residentNames = resident.split(",");

        house.setFloorsNumber(floor);
        house.setAddress(address);
        house.setResidentsNames(residentNames);

        scanner.close();

        System.out.println("floor number: " + house.getFloorsNumber());
        System.out.println("address: " + house.getAddress());
        System.out.println("residents" + Arrays.toString(house.getResidentsNames()));



    }


}