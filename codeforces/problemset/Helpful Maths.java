import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '+') {
                num.add(input.charAt(i) - '0');
            }
        }
        Collections.sort(num);
        String output = "";
        for (int i = 0; i < num.size(); i++) {
            output += num.get(i);
            output += '+';
        }
        System.out.println(output.substring(0, output.length() - 1));
        sc.close();
    }
}