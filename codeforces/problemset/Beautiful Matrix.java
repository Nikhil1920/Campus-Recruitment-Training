
// BeautifulMatrix
// codeforces 263 a
import java.util.Scanner;

class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x_pos = 0;
        int y_pos = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    x_pos = i;
                    y_pos = j;
                }
            }
        }
        System.out.println(Math.abs(x_pos - 2) + Math.abs(y_pos - 2));
        sc.close();
    }
}