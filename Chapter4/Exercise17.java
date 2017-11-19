import java.util.Scanner;

//        Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//        data from the user.

public class Exercise17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GasMileage gasMileage = new GasMileage();
        char option = 'y';

        while (option != 'n'){
            System.out.print("Enter miles driven: ");
            int miles = input.nextInt();
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            System.out.println("Miles per gallon for this trip: " + gasMileage.getMilesPerGallon(miles, gallons));
            System.out.println("The total average of miles per gallon for all trips is "
                    + gasMileage.getTotalMilesPerGallon());

            do {
                System.out.println("\nDo tou want to add another trip (y/n):");
                option = Character.toLowerCase(input.next().charAt(0));
            } while (option != 'y' && option != 'n');
        }
    }
}
