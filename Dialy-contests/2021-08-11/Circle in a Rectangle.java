import java.util.Scanner;

class CircleInRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        boolean isValid = true;
        if (x + r > w || x - r < 0)
            isValid = false;

        if (y + r > h || y - r < 0)
            isValid = false;
        System.out.println(isValid ? "Yes" : "No");
        sc.close();
    }
}