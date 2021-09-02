
// Lucky Four
import java.util.Scanner;

class LUCKFOUR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        sc.nextLine();
        while (num_of_cases-- > 0) {
            String s = sc.nextLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '4')
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}