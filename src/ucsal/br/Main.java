package ucsal.br;
import java.util.Scanner;

public class Main {
	
	static final String[] proibidas = {"PICARO", "DOENTE", "SORVETEIRO","PAULO"};
	
	public static void main(String[] args) {

		Transformar t= new Transformar();
		
		String mensagem = obterTexto();
		t.transformar(proibidas, mensagem);
		
	}


	private static String obterTexto() {
		System.out.println("Digite sua mensagem:");
		Scanner sc = new Scanner(System.in);
		String mensagem = sc.nextLine();
		String upper = mensagem.toUpperCase();
		sc.close();
		return upper;
	}

}
