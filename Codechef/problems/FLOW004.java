import java.util.Scanner;

class FLOW004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        sc.nextLine();
        while (num_of_cases-- > 0) {
            String num = sc.nextLine();
            System.out.println((num.charAt(0) - '0') + (num.charAt(num.length() - 1) - '0'));
        }
        sc.close();
    }

}