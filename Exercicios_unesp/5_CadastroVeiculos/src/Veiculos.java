import java.util.ArrayList;
import java.util.Scanner;

class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getInfo() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nPreço: " + preco;
    }
}

public class Veiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de veículo (1 para Carro, 2 para Moto, 0 para sair):");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 0) {
                break;
            }

            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            if (escolha == 1) {
                System.out.print("Quilometragem: ");
                int km = scanner.nextInt();
                veiculos.add(new Carro(marca, modelo, ano, preco, km));
            } else if (escolha == 2) {
                veiculos.add(new Moto(marca, modelo, ano, preco));
            }
        }

        // Imprime relatório com características de cada veículo
        System.out.println("\nRelatório de Veículos:");
        for (Veiculo veiculo : veiculos) {
            System.out.println("\n" + veiculo.getInfo());
            System.out.println("----------------------------");
        }

        // Calcula e imprime o total de preços antes do reajuste
        double totalPrecoAntesReajuste = veiculos.stream().mapToDouble(Veiculo::getPreco).sum();
        System.out.println("\nTotal de Preços Antes do Reajuste: " + totalPrecoAntesReajuste);

        // Realiza o reajuste de acordo com as condições do item (B)
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto && veiculo.ano >= 2008) {
                veiculo.preco *= 1.10;
            } else if (veiculo instanceof Carro && ((Carro) veiculo).getKm() > 100000) {
                veiculo.preco *= 0.92;
            }
        }

        // Calcula e imprime o total de preços após o reajuste
        double totalPrecoAposReajuste = veiculos.stream().mapToDouble(Veiculo::getPreco).sum();
        System.out.println("\nTotal de Preços Após o Reajuste: " + totalPrecoAposReajuste);
        System.out.println("\n----------------------------");

        scanner.close();
    }
}