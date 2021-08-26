
// WayTooLongWords
import java.util.Scanner;

class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            String word = sc.next();
            int len = word.length();
            if (len > 10)
                System.out.println(word.charAt(0) + Integer.toString(len - 2) + word.charAt(len - 1));
            else
                System.out.println(word);
        }
        sc.close();
    }
}