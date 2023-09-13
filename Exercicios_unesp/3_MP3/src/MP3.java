//mp3
public class MP3 extends ArquivoMultimidia {
    public MP3(String nome, String extensao, double precoBase) {
        super(nome, extensao, precoBase);
    }

    public void reajustarPreco() {
        if (downloads > 5000) {
            precoBase *= 1.05;
        }
    }
}
// mp4
 class MP4 extends ArquivoMultimidia {
    public MP4(String nome, String extensao, double precoBase) {
        super(nome, extensao, precoBase);
    }

    public void reajustarPreco() {
        if (visitas > 10000) {
            precoBase *= 1.08;
        }
    }
}
