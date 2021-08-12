import java.util.Scanner;

class CatsAndAMouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int cat_a = sc.nextInt();
            int cat_b = sc.nextInt();
            int mouse = sc.nextInt();
            int a_dist = Math.abs(mouse - cat_a);
            int b_dist = Math.abs(mouse - cat_b);
            if (a_dist == b_dist) {
                System.out.println("Mouse C");
            } else {
                System.out.println(a_dist < b_dist ? "Cat A" : "Cat B");
            }
            num_of_cases--;
        }
        sc.close();
    }
}