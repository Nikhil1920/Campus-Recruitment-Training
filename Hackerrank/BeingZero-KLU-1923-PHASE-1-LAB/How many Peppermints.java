import java.util.Scanner;

class HowManyPeppermints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int pep_num = sc.nextInt();
            int wrap_num = sc.nextInt();
            int count = 0;
            pep_num += wrap_num / 7;
            wrap_num = wrap_num % 7;
            while (pep_num > 0) {
                count += pep_num;
                wrap_num += pep_num;
                pep_num = wrap_num / 7;
                wrap_num = wrap_num % 7;
            }
            System.out.println(count);
            num_of_cases--;
        }
        sc.close();
    }
}