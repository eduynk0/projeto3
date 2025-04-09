import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner eduardo = new Scanner(System.in);
        
        System.out.print("Número entre 1 a 100 para ser adivinhado: ");
		int al = eduardo.nextInt();
		
		int tentativas = 1;
		int  palpite = 0;
		
		while (palpite != al) {
		    System.out.print("Número entre 1 a 100: ");
		    palpite = eduardo.nextInt();
		    
			if (palpite > al ) {
				System.out.println("Menor");
				tentativas += 1;}
			if (palpite < al ) {
				System.out.println("Mais");
				tentativas += 1;}}
        System.out.print(al + " é a resposta, " + tentativas + " tentativas");}}
