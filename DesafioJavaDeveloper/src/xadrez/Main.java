package xadrez;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		if((linha+coluna)%2==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		sc.close();
	}

}
