
// chefAndFriends
import java.util.Scanner;

class chefAndFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        int count = 0;
        while (num_of_cases-- > 0) {
            String s = sc.next();
            String chef = "chef";
            for (int i = 0; i < s.length() - 1; i++) {
                String sub = s.substring(i, i + 2);
                if (chef.contains(sub)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}