public class Atividade1 {

    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; 
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; 
            }
        }

        return 1; 
    }

    public static void main(String[] args) {
        Integer numero = 1; 

        int resultado = verificaNumeroPrimo(numero);

        if (resultado == 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
