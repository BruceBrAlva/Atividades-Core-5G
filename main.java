package Principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        int escolha=0;
        int testeMorto;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Escolha:");
            System.out.println("1 - Alimente");
            System.out.println("2 - Ataque");
            System.out.println("3 - Deixe o zumbi se alimentar de voce!");
            System.out.println("4 - Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Quanto de alimento deseja dar ao zumbi? (10g de carne = 1hp)");
                    int carne = 0;
                    carne = sc.nextInt() / 10;
                    zumbi1.alimentar(carne);
                    break;
                case 2:
                    System.out.println("Quanto de dano seu ataque aplicou? ");
                    int dano = 0;
                    dano = sc.nextInt();
                    testeMorto = zumbi1.perderVida(dano);
                    if(testeMorto<=0){
                        escolha = 4;
                    }
                    break;
                case 3:
                    System.out.println("Você é devorado pelo zumbi...");
                    System.out.println("Agora ele está saciado!");
                    break;
            }
        }while(escolha!=4);
    }
}
