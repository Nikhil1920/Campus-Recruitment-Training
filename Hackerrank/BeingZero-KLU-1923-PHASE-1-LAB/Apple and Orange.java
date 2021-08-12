import java.util.Scanner;

class AppleAndOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] app = new int[m];
        int[] orange = new int[n];
        for (int i = 0; i < m; i++) {
            app[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            orange[i] = sc.nextInt();
        }
        int app_count = 0;
        int orange_count = 0;
        for (int i = 0; i < m; i++) {
            if (contains(s, t, a, app[i]))
                app_count++;
        }
        for (int i = 0; i < n; i++) {
            if (contains(s, t, b, orange[i]))
                orange_count++;
        }
        System.out.println(app_count);
        System.out.println(orange_count);
        sc.close();
    }

    public static boolean contains(int s, int t, int a, int dis) {
        if (a + dis >= s && a + dis <= t) {
            return true;
        }
        return false;
    }
}