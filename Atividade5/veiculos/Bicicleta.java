package veiculos;

public class Bicicleta extends Veiculo {
    private String tipo;

    public Bicicleta(String marca, String modelo, int anoFabricacao, String tipo) {
        super(marca, modelo, anoFabricacao);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
