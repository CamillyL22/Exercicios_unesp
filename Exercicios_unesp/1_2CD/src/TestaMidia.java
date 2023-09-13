import java.util.Random;
import java.util.Scanner;
    public class TestaMidia
{
    public static void main(String [] args)
    {
        Midia[] lista = new Midia[10];
        int opcao;
        for (int i=0; i < 2; i++)
        {

            Random randomNumbers = new Random();
            opcao = randomNumbers.nextInt();
            if (1 == opcao)
                lista[i] = new CD();
            else
                lista[i] = new DVD();
            lista[i].inserirDados();
        }
        for (int i=0; i < 2; i++)
            lista[i].printDados();
    }

}
