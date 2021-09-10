import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Summing Triplets

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long num_of_cases = Long.parseLong(reader.readLine());
        while (num_of_cases-- > 0) {
            long sum = 0;
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            for (int i = 0; i < 3; i++) {
                sum += Long.parseLong(tk.nextToken());
            }
            System.out.println(sum);
        }
        reader.close();
    }
}