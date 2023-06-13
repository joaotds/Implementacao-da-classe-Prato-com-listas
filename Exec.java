import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Prato> pratos = new ArrayList<>();

        // Leitura dos dados dos pratos
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Informe o nome do prato " + i + ":");
            String nome = scanner.nextLine();

            System.out.println("Informe o preço do prato " + i + ":");
            double preco = scanner.nextDouble();

            Prato prato = new Prato();
            prato.nome = nome;
            prato.preco = preco;

            pratos.add(prato);
        }
        scanner.close();

        // Impressão dos dados dos pratos
        System.out.println("Dados dos pratos:");
        for (Prato prato : pratos) {
            System.out.println("Nome: " + prato.nome);
            System.out.println("Preço: R$" + prato.preco);
            System.out.println();
        }

        // Cálculo do valor total gasto
        double valorTotal = 0;
        for (Prato prato : pratos) {
            valorTotal += prato.preco;
        }

        // Impressão do valor total gasto
        System.out.println("Valor total gasto: R$" + valorTotal);
    }
}
