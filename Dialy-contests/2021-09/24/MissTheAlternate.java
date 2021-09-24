// MissTheAlternate

import java.util.Scanner;

class MissTheAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            String ans = "";
            String inp = sc.next();
            for (int i = 0; i < inp.length(); i++) {
                if (i % 2 == 0) {
                    ans += inp.charAt(i);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}