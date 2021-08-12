import java.util.Scanner;

class GirlsAndBoys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int girls_num = sc.nextInt();
        int boys_num = sc.nextInt();
        if (girls_num == boys_num) {
            System.out.println(1);
        } else if (girls_num < boys_num) {
            System.out.println((int) Math.ceil((double) boys_num / (girls_num + 1)));
        } else {
            System.out.println((int) Math.ceil((double) girls_num / (boys_num + 1)));
        }
        sc.close();
    }
}