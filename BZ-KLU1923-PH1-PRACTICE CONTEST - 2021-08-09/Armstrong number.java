import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num_as_string = Integer.toString(num);
        long sum = 0;
        for (int i = 0; i < num_as_string.length(); i++) {
            int temp = num_as_string.charAt(i) - '0';
            sum += temp * temp * temp;
        }
        System.out.println(num == sum ? "Yes" : "No");
        sc.close();
    }
}
