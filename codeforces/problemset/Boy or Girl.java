
// Boy or Girl
// codeforces 236 a
import java.util.HashSet;
import java.util.Scanner;

class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        HashSet<Character> h = new HashSet<Character>();
        for (int i = 0; i < line.length(); i++) {
            h.add(line.charAt(i));
        }
        System.out.println(h.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
        sc.close();
    }
}