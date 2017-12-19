import java.util.*;

public class Exercise16 {

    public static void main(String[] args) {
        List<String> words = enterSentence();
        List<String> duplicates = new ArrayList<>(findDuplicates(words));

        if (duplicates.size() == 0) {
            System.out.println("There are no duplicate words in the sentence.");
        } else {
            System.out.print("Duplicate words are: ");
            for (String word : duplicates) {
                System.out.print(word + " ");
            }
        }
    }

    public static List<String> enterSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String[] words = scanner.nextLine().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        return new ArrayList<>(Arrays.asList(words));
    }

    public static Set<String> findDuplicates(List<String> words) {
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    duplicates.add(words.get(i));
                }
            }
        }

        return duplicates;
    }
}