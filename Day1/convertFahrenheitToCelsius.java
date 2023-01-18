package BasicProgramDay1;

import java.util.Scanner;

public class convertFahrenheitToCelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = in.nextInt();
        temperature = ((temperature-32)*5)/9;

        System.out.println("Temperature in Celsius = " + temperature);

    }
}
//OP :-
// Enter temperature in Fahrenheit
//90
//Temperature in Celsius = 32.22222