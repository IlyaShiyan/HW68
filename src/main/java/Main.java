import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try {
            while (true) {
                String str = bufferedReader.readLine();
                if (".".equals(str)) {
                    System.out.println(sum);
                    break;
                } else
                    sum += Integer.parseInt(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException exception) {
            System.out.println("Enter number");
        }
    }
}
