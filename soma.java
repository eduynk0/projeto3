import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Número 1: ");
        int n = ler.nextInt();
        
        System.out.print("Número 2: ");
        int n2 = ler.nextInt();
        
        System.out.print("A soma dos números é: "+ (n+n2));
    }
}
