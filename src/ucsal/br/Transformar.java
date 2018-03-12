package ucsal.br;

import java.util.Arrays;

public class Transformar {

	public void transformar(String[] proibidas, String upper) {
		String convertido = upper;
		if (!Arrays.stream(proibidas).noneMatch(upper::contains)) {
			convertido = upper.replaceAll(proibidas[0], "*").replaceAll(proibidas[1], "*").replaceAll(proibidas[2], "*")
					.replaceAll(proibidas[3], "*");
		}
		System.out.println(convertido);
	}
}
