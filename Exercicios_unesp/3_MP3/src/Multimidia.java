import java.util.Random;
class ArquivoMultimidia {
    String nome;
    String extensao;
    double precoBase;
    int downloads;
    int visitas;

    public ArquivoMultimidia(String nome, String extensao, double precoBase) {
        this.nome = nome;
        this.extensao = extensao;
        this.precoBase = precoBase;
        this.downloads = new Random().nextInt(10001);
        this.visitas = new Random().nextInt(20001);
    }

    public void reajustarPreco() {
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Extensão: " + extensao);
        System.out.println("Preço Base: R$" + String.format("%.2f", precoBase));
        System.out.println("Downloads: " + downloads);
        System.out.println("Visitas: " + visitas);
    }
}
