import java.util.Arrays;
import java.util.Scanner;

public class Teste {
	
	static final String[] proibidas = {"PICARO", "DOENTE", "SORVETEIRO","PAULO"};
	
	public static void main(String[] args) {

		String mensagem = obterTexto();
		Transformar(proibidas, mensagem);
		
	}


	private static String obterTexto() {
		System.out.println("Digite sua mensagem:");
		Scanner sc = new Scanner(System.in);
		String mensagem = sc.nextLine();
		String upper = mensagem.toUpperCase();
		sc.close();
		return upper;
	}

	
	private static void Transformar(String[] proibidas, String upper) {
		String convertido = upper;
		if (!Arrays.stream(proibidas).noneMatch(upper::contains)) {
			convertido = upper.replaceAll(proibidas[0], "*").replaceAll(proibidas[1], "*")
					.replaceAll(proibidas[2], "*").replaceAll(proibidas[3], "*");
		}
		System.out.println(convertido);
	}
}
