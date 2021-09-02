import java.util.Scanner;

class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char first = word.charAt(0);
        if (first - 'a' >= 0) {
            first = (char) ('A' + (first - 'a'));
        }
        System.out.println(first + word.substring(1));
        sc.close();
    }
}