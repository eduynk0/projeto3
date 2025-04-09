import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        
        System.out.print("Digite um número: ");
        int limite = teclado.nextInt();
        
        int random = gerador.nextInt(limite) + 1;
        
        System.out.print("O número escolhido entre 1 a "+limite+ " foi: "+random);}}
