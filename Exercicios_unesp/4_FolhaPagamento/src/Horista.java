public class Horista extends Funcionario {
    private double taxaHoraria;
    private double horasTrabalhadas;

    public Horista(String nome, double taxaHoraria) {
        super(nome);
        this.taxaHoraria = taxaHoraria;
        this.horasTrabalhadas = 0;
    }

    public void adicionarHoras(double horas) {
        horasTrabalhadas += horas;
    }

    @Override
    public double calcularSalario() {
        return taxaHoraria * horasTrabalhadas;
    }
}
