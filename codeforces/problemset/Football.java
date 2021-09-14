import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int max = 0;
        int curr_len = 1;
        for (int i = 0; i < inp.length(); i++) {
            for (int j = i + 1; j < inp.length(); j++) {
                if (inp.charAt(i) == inp.charAt(j)) {
                    curr_len++;
                } else {
                    break;
                }
            }
            max = Math.max(max, curr_len);
            curr_len = 1;
        }
        System.out.println(max >= 7 ? "YES" : "NO");
        sc.close();
    }
}
