import java.util.*;

public class Exercise13 {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        printMenu();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();

            if (option == 0) {
                break;
            }

            performAction(names, option);
        }
    }

    public static void printMenu() {
        System.out.println("Choose an option:\n" +
                "1 - to add a new name\n" +
                "2 - to search for a name\n" +
                "3 - to display available options\n" +
                "4 - to display stored names\n" +
                "0 - to exit");
    }

    public static void performAction(Set<String> names, int option) {
        switch (option) {
            case 1:
                addName(names);
                break;
            case 2:
                searchName(names);
                break;
            case 3:
                printMenu();
                break;
            case 4:
                displayNames(names);
                break;
            default:
                System.out.println("You entered a wrong option. Press 3 to display available options!");
        }
    }

    public static void addName(Set<String> names) {
        System.out.print("Enter the new name: ");
        names.add(new Scanner(System.in).nextLine());
    }

    public static void searchName(Set<String> names) {
        List<String> list = new ArrayList<>(names);
        System.out.print("Enter the name to search for: ");
        int index = list.indexOf(new Scanner(System.in).nextLine());

        if (index < 0) {
            System.out.println("The name you searched for is not in the list");
        } else {
            System.out.println("The name you searched for is at index " + index + " in the list");
        }
    }

    public static void displayNames(Set<String> names) {
        System.out.print("Names stored: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}