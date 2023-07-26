import java.util.ArrayList;
import java.util.List;

// Classe que vai armazenar a lista
public class Compras {
    private List<Item> listaDeCompras;
    public Compras(List<Item> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }

    public Compras() {
        listaDeCompras = new ArrayList<>();
    }

    public List<Item> getListaDeCompras() {
        return listaDeCompras;
    }

    public void setListaDeCompras(List<Item> listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }
}
