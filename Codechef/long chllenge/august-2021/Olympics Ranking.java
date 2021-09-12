import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int fg = sc.nextInt();
            int fs = sc.nextInt();
            int fb = sc.nextInt();
            int sg = sc.nextInt();
            int ss = sc.nextInt();
            int sb = sc.nextInt();
            int f_sum = fg + fs + fb;
            int s_sum = sg + ss + sb;
            int isBetter = f_sum > s_sum ? 1 : 2;
            System.out.println(isBetter);
            num_of_cases--;
        }
        sc.close();
    }
}