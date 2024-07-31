import java.util.Scanner;

public class TempratureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temprature;
        System.out.print("Press 1 for Celsius to Fahrenheit.\n" +
                "Press 2 for Fahrenheit to Celsius." +
                "\nPress anykey to exit." +
                "\nEnter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("Enter the Temprature in Celsius :");
                temprature = sc.nextFloat();
                double result = celsiusToFahrenheit(temprature);
                System.out.println("Temparture in Celsius : " + temprature +
                        "\nTemprature in Fahrenheit : " + result);
                break;

            }
            case 2: {
                System.out.print("Enter the Temprature in Fahrenheit :");
                temprature = sc.nextFloat();
                double result = fahrenheitToCelsius(temprature);
                System.out.println("Temparture in Fahrenheit : " + temprature +
                        "\nTemprature in Celsius : " + result);
                break;

            }
            default:
                System.out.println("XXXXX--Please Enter a Valid input--XXXXX");
        }

    }

    private static double fahrenheitToCelsius(double temprature) {
        double tempInCel = (temprature - 32) * 5.0 / 9.0;
        return tempInCel;
    }

    private static double celsiusToFahrenheit(double temprature) {
        double tempInFahr = (9.0 / 5.0 * temprature) + 32;
        return tempInFahr;
    }
}
