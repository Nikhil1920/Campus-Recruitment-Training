import java.util.*;

class TriangleValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_valid = true;
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a + b <= c || a + c <= b || b + c <= a)
            is_valid = false;

        System.out.println(is_valid ? "YES" : "NO");
        sc.close();
    }
}
