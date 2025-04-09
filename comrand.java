import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        
        char jd = 's';
        
        while (jd == 's') {
            int random = gerador.nextInt(100) + 1;
            int tentativas = 1;
            int palpite = 0;
            
            while (palpite != random) {
                System.out.print("Número entre 1 a 100: ");
                palpite = teclado.nextInt();
                
                if (palpite > random) {
                    System.out.println("Menor");
                    tentativas++;
                } else if (palpite < random) {
                    System.out.println("Maior");
                    tentativas++;
                }
            }
            
            System.out.println(random + " é a resposta, " + tentativas + " tentativas.");
            System.out.print("Quer jogar de novo? [s] [n]: ");
            
            jd = teclado.next().charAt(0);
        }
        
        System.out.println("Jogo encerrado!");
    }
}
