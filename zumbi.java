package Principal;
import java.util.Scanner;

public class Zumbi {
    String nome;
    int saude=50;
    boolean alimentado;
    Scanner sc = new Scanner(System.in);

    void alimentar(int sauderecebida){
        saude = saude + sauderecebida;
        System.out.println("Agora o zumbi tem "+saude+" de vida!");
        if(saude >= 100){
            alimentado = true;
            System.out.println("O zumbi está saciado!");
        }if(saude < 100){
            alimentado = false;
            System.out.println("O zumbi está com fome!");
        }
    }

    int perderVida(int sauderecebida){
        saude = saude - sauderecebida;
        if(saude >= 100) {
            alimentado = true;
            System.out.println("Soco na BOCA, porém o zummbi ainda está saciado.");
        }if(saude < 100 && saude > 0){
            alimentado = false;
            System.out.println("Dá um tiro no zumbi, agora ele está com fome.");
            System.out.println("Agora o zumbi tem "+saude+" de vida!");
        }
        if(saude <= 0){
            System.out.println("Qué Ota?, você acabou com o zumbi!");

        }
        return (saude);
    }


}
