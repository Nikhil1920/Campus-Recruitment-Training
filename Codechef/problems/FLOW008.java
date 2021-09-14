import java.util.Scanner;

class FLOW008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            System.out.println(sc.nextInt() < 10 ? "Thanks for helping Chef!" : "-1");
        }
        sc.close();
    }
}