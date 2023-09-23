package executavel;
import java.util.Scanner;

import veiculos.Bicicleta;
import veiculos.Carro;
import veiculos.Moto;
import veiculos.Veiculo;

public class Executavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do Carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int anoCarro = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Número de Portas: ");
        int portasCarro = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        Carro meuCarro = new Carro(marcaCarro, modeloCarro, anoCarro, portasCarro);

        System.out.println("\nDigite os dados da Moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int anoMoto = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Cilindradas: ");
        int cilindradasMoto = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        Moto minhaMoto = new Moto(marcaMoto, modeloMoto, anoMoto, cilindradasMoto);

        System.out.println("\nDigite os dados da Bicicleta:");
        System.out.print("Marca: ");
        String marcaBicicleta = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloBicicleta = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        int anoBicicleta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Tipo: ");
        String tipoBicicleta = scanner.nextLine();

        Bicicleta minhaBicicleta = new Bicicleta(marcaBicicleta, modeloBicicleta, anoBicicleta, tipoBicicleta);

        scanner.close();

        System.out.println("\nInformações do Carro:");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano de Fabricação: " + meuCarro.getAnoFabricacao());
        System.out.println("Número de Portas: " + meuCarro.getNumPortas());

        System.out.println("\nInformações da Moto:");
        System.out.println("Marca: " + minhaMoto.getMarca());
        System.out.println("Modelo: " + minhaMoto.getModelo());
        System.out.println("Ano de Fabricação: " + minhaMoto.getAnoFabricacao());
        System.out.println("Cilindradas: " + minhaMoto.getCilindradas() + " cc");

        System.out.println("\nInformações da Bicicleta:");
        System.out.println("Marca: " + minhaBicicleta.getMarca());
        System.out.println("Modelo: " + minhaBicicleta.getModelo());
        System.out.println("Ano de Fabricação: " + minhaBicicleta.getAnoFabricacao());
        System.out.println("Tipo: " + minhaBicicleta.getTipo());
    }
}
