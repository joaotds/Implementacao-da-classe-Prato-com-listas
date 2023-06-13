import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prato> pratos = new ArrayList<>();

        // ler dados
        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe o nome do prato " + i + ":");
            String nome = System.console().readLine();

            System.out.println("Informe o preço do prato " + i + ":");
            double preco = Double.parseDouble(System.console().readLine());

            Prato prato = new Prato(nome, preco);
            pratos.add(prato);
        }

        // dados dos pratos
        System.out.println("Dados dos pratos:");
        for (Prato prato : pratos) {
            System.out.println("Nome: " + prato.getNome());
            System.out.println("Preço: R$" + prato.getPreco());
            System.out.println();
        }

        // valor gasto
        double valorTotal = 0;
        for (Prato prato : pratos) {
            valorTotal += prato.getPreco();
        }

        // imprime no console
        System.out.println("Valor total gasto: R$" + valorTotal);
    }
}
