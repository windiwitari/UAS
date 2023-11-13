import java.util.Scanner;

public class uts {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("  mulai Suhu Celsius : ");
            int startCelsius = scanner.nextInt();
            System.out.println("Selesei Suhu Celsius : ");
            int endCelsius = scanner.nextInt();

            System.out.println("Celsius\tFahrenheit");

            for (int celsius = startCelsius; celsius <= endCelsius; celsius += 5) {

                int fahrenheit;
                System.out.println(celsius + "\t" + fahrenheit);
            }
        }
    }