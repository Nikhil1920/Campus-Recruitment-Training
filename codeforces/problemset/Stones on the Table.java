import java.util.Scanner;

class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine();
        int i = 0;
        int j = 1;
        int result = 0;
        if (n > 1) {
            while (i < n && j < n) {
                if (word.charAt(i) == word.charAt(j)) {
                    ++j;
                    ++result;
                } else {
                    i += (j - i);
                    ++j;
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}