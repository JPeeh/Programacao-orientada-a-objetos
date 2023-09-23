import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        double temperatura;
        double resultado;

        switch (escolha) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                resultado = celsiusToFahrenheit(temperatura);
                System.out.println("Temperatura em Fahrenheit: " + resultado);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble();
                resultado = fahrenheitToCelsius(temperatura);
                System.out.println("Temperatura em Celsius: " + resultado);
                break;
            default:
                System.out.println("Escolha inválida.");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
