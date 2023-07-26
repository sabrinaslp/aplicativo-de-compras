import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Item> listaDeCompras = new ArrayList<>();
        int opcao = 1;
        double saldo = 0.0;

        Cartao cartao = new Cartao();
        Compras compra = new Compras(listaDeCompras);

        System.out.println("Digite o limite do cartão: ");
        cartao.setLimite(input.nextDouble());

        while (opcao == 1) {
            input.nextLine();
            Item item = new Item();
            System.out.println("Digite a descrição da compra: ");
            item.setDescricao(input.nextLine());

            System.out.println("Digite o valor da compra: ");
            item.setValorItem(input.nextDouble());

            if (saldo + item.getValorItem() > cartao.getLimite()) {
                System.out.println("Saldo insuficiente!");
                System.out.println("-----------------------------------------");
                System.out.println("Compras realizadas:");
                System.out.println("-----------------------------------------");

                for (Item itens : listaDeCompras) {
                    System.out.println(itens.getDescricao() + " - " + itens.getValorItem());
                }

                System.out.println("Saldo do cartão: " + (cartao.getLimite() - saldo));

            } else {
                saldo += item.getValorItem();
                compra.getListaDeCompras().add(item);
                System.out.println("Compra realizada!");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            opcao = input.nextInt();

        }

        System.out.println("-----------------------------------------");
        System.out.println("Compras finalizadas!");
        System.out.println("-----------------------------------------");

        for (Item itens : listaDeCompras) {
            System.out.println(itens.getDescricao() + " - " + itens.getValorItem());
        }
        System.out.println("Saldo do cartão: " + (cartao.getLimite() - saldo));

    }
}
