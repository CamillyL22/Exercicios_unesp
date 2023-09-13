import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de funcionário (1 para Assalariado, 2 para Horista, 0 para sair): ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (escolha == 0) {
                break;
            }

            System.out.print("Nome do funcionário: ");
            String nome = scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Salário mensal do funcionário assalariado: ");
                double salarioMensal = scanner.nextDouble();
                funcionarios.add(new Assalariado(nome, salarioMensal));
            } else if (escolha == 2) {
                System.out.print("Taxa horária do funcionário horista: ");
                double taxaHoraria = scanner.nextDouble();
                Horista horista = new Horista(nome, taxaHoraria);

                System.out.print("Quantas horas o funcionário horista trabalhou: ");
                double horasTrabalhadas = scanner.nextDouble();
                horista.adicionarHoras(horasTrabalhadas);

                funcionarios.add(horista);
            }
        }

        double custoTotalFolha = funcionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();

        System.out.println("\nFolha de Pagamento:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            if (funcionario instanceof Horista) {
                System.out.println("Tipo: Horista");
            } else {
                System.out.println("Tipo: Assalariado");
            }
            System.out.println("Salário: " + funcionario.calcularSalario());
            System.out.println("---------------------");
        }

        System.out.println("Custo total da folha salarial: " + custoTotalFolha);

        scanner.close();
    }
}
