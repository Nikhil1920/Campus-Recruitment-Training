import java.util.Scanner;

class GradingStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int grade = sc.nextInt();
            if (grade < 38) {
                System.out.println(grade);
            } else {
                int mul = (grade / 5) + 1;
                int up_5 = mul * 5;
                if (up_5 - grade < 3) {
                    System.out.println(up_5);
                } else {
                    System.out.println(grade);
                }
            }
            num_of_cases--;
        }
        sc.close();
    }
}