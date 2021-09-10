import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Summing Triplets

class SummingTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        long num_of_cases = Long.parseLong(reader.readLine());
        while (num_of_cases-- > 0) {
            long sum = 0;
            String[] strNums = new String[3];
            strNums = reader.readLine().split("\\s");
            for (int i = 0; i < strNums.length; i++) {
                sum += Long.parseLong(strNums[i]);
            }
            log.write(sum + "\n");
        }
        log.flush();
        reader.close();
        log.close();
    }
}