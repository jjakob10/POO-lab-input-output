package numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatTest {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);

		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Entre com um número: ");
			boolean entradaValida = false;
			do {
				try {
					if (s.hasNext()) {
						int i = nf.parse(s.next()).intValue();
						entradaValida = true;
						System.out.println("O número entrado foi: " + i);
					}
				} catch (ParseException e) {
					System.out.print("Formato incorreto. Entre novamente com um número: ");
				}
			} while (!entradaValida);
		}
	}

}
