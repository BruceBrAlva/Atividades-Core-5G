package Principal;
import java.util.Scanner;
public class Kart {
    Motor motor1 = new Motor();
    Piloto piloto1 = new Piloto();
    String nome = "Flash";
    Scanner sc = new Scanner(System.in);
    void fazerDrift(){
        System.out.println("Parabéns Dominik Toreto, você Driftou");
    }
    void soltarTurbo(){
        System.out.println("Você usou o Nitro e soltou um turbo!");
    }
    void pular(){
        System.out.println("Você pula pela rampa e sai voando!!");
    }
}

