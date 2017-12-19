import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise18 {

    public static void main(String[] args) {
        List<Character> list = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
        List<Character> reversedList = reverseList(list);

        System.out.print("The reversed list is: ");
        for (Character ch : reversedList) {
            System.out.print(ch + " ");
        }
    }

    private static List<Character> reverseList(List<Character> list) {
        List<Character> reversedList = new LinkedList<>();
        ListIterator<Character> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            reversedList.add(listIterator.previous());
        }

        return reversedList;
    }
}
