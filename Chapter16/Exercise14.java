import java.util.*;

public class Exercise14 {

    public static void main(String[] args) {
        // create HashMap to store Character keys and Integer values
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    }

    // create map from user input
    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        String[] tokens = input.split(" ");

        // processing input text
        for (String token : tokens) {
            String word = token.toLowerCase(); // get lowercase word
            for (int i = 0; i < word.length(); i++) {
                // if the map contains the letter
                Character letter = word.charAt(i);
                if (map.containsKey(letter)) { // is letter in map
                    int count = map.get(letter); // get current count
                    map.put(letter, count + 1); // increment count
                } else
                    map.put(letter, 1); // add new letter with a count of 1 to map
            }
        }
    }

    // display map content
    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (Character key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}