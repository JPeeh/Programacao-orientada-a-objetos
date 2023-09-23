package veiculos;
public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidade;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    public void frear(int valor) {
        if (valor <= this.velocidade) {
            this.velocidade -= valor;
        } else {
            this.velocidade = 0;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
