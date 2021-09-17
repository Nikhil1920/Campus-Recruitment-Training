
// Shuffle-Puffle
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int[] count = new int[26];
            String guest = sc.next();
            String host = sc.next();
            String random = sc.next();
            System.out.println("guest " + guest + " host " + host + " random " + random);
            int[] random_count = new int[26];
            for (int i = 0; i < guest.length(); i++) {
                count[guest.charAt(i) - 'A']++;
            }
            for (int i = 0; i < host.length(); i++) {
                count[host.charAt(i) - 'A']++;
            }
            for (int i = 0; i < random.length(); i++) {
                random_count[random.charAt(i) - 'A']++;
            }
            boolean result = true;
            for (int i = 0; i < 26; i++) {
                count[i] = count[i] - random_count[i];
                if (count[i] > 0) {
                    result = false;
                    break;
                }
            }
            System.out.println(result ? "YES" : "NO");
        }
        sc.close();
    }
}