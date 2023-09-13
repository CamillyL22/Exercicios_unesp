public class LojaVirtual {
    public static void main(String[] args) {

        ArquivoMultimidia[] arquivos = new ArquivoMultimidia[4];

        for (int i = 0; i < 4; i++) {
            String extensao = (Math.random() < 0.5) ? "mp3" : "mp4";
            String nome = "Arquivo_" + (i + 1);
            double precoBase = 1.0 + Math.random() * 9.0;

// equals para comparar strings ao invés de comparar referencias
            if (extensao.equals("mp3")) {
                arquivos[i] = new MP3(nome, extensao, precoBase);
            } else {
                arquivos[i] = new MP4(nome, extensao, precoBase);
            }

            System.out.println("Informações do arquivo antes do reajuste:");
            arquivos[i].mostrarInformacoes();

            arquivos[i].reajustarPreco();

            System.out.println("\nInformações do arquivo após o reajuste:");
            arquivos[i].mostrarInformacoes();
            System.out.println();
        }
    }
}
