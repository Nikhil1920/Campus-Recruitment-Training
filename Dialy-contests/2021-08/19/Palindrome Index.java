import java.util.Scanner;

class PalindromeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            String s = sc.next();

            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (isPalidrom(s, i, j - 1)) {
                        System.out.println(j);
                    } else {
                        System.out.println(i);
                    }
                    break;
                }
                i++;
                j--;
            }

            if (i >= j) {
                System.out.println(-1);
            }
            num_of_cases--;
        }
        sc.close();
    }

    static boolean isPalidrom(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}