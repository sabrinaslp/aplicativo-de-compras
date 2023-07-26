// Classe que vai armazenar as informações do cartão (limite)
public class Cartao {
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }
    public Cartao() {

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


}
