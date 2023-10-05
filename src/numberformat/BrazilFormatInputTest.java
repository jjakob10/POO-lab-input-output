package numberformat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class BrazilFormatInputTest {

	public static void main(String[] args) {
		try {
			Locale brLocale = Locale.forLanguageTag("pt-BR");
			NumberFormat nf = NumberFormat.getInstance(brLocale);

			int i = nf.parse("1,000").intValue();
			System.out.println(i);
		} catch (ParseException e) {
			System.out.println("Formato Inválido!");
		}

	}

}
