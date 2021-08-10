import java.util.*;

class first_and_last_digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        sc.nextLine();
        while (num_of_cases > 0) {
            String num_as_string = sc.nextLine();
            int first_digit = num_as_string.charAt(0) - '0';
            int last_digit = num_as_string.charAt(num_as_string.length() - 1) - '0';
            System.out.println(first_digit + last_digit);
            num_of_cases--;
        }
        sc.close();
    }
}
