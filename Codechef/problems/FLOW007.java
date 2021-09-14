import java.util.Scanner;

class FLOW007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        sc.nextLine();
        while (num_of_cases-- > 0) {
            String num = sc.nextLine();
            int result = 0;
            for (int i = 0; i < num.length(); i++) {
                result += (num.charAt(i) - '0') * Math.pow(10, i);
            }
            System.out.println(result);
        }
        sc.close();
    }
}