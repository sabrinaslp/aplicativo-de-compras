// Classe que vai armazenar as informações dos itens
public class Item {
    private String descricao;
    private double valorItem;

    public Item(String descricao, double valorItem) {
        this.descricao = descricao;
        this.valorItem = valorItem;
    }

    public Item(double valorItem) {
        this.valorItem = valorItem;
    }

    public Item() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }
}
