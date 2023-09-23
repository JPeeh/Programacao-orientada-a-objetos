package veiculos;
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindradas) {
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
