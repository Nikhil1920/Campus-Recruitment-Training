
// Shuffle-Puffle
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            String guest = sc.next();
            String host = sc.next();
            String random = sc.next();
            boolean result = false;
            guest += host;
            char[] tempGuest = guest.toCharArray();
            Arrays.sort(tempGuest);
            guest = new String(tempGuest);
            char[] tempRandom = random.toCharArray();
            Arrays.sort(tempRandom);
            random = new String(tempRandom);
            if (guest.equals(random)) {
                result = true;
            }
            System.out.println(result ? "YES" : "NO");
        }
        sc.close();
    }
}