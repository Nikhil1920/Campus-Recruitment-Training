import java.util.*;

class NarcissisticNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num_as_string = Integer.toString(num);
        int power = num_as_string.length();
        long sum = 0;
        for (int i = 0; i < num_as_string.length(); i++) {
            int temp = num_as_string.charAt(i) - '0';
            sum += power(temp, power);
        }
        System.out.println(num == sum ? "Yes" : "No");
        sc.close();
    }

    static long power(int num, int power) {
        long result = 1;
        while (power > 0) {
            result *= num;
            power--;
        }
        return result;
    }
}
