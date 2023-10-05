package numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatOutputTest {

	public static void main(String[] args) {

		double number = 9827423123.87263;
		System.out.println(number);
		
		// 9.827.423.123,87
		// Usando Locale.US: 9,827,423,123.87
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setGroupingUsed(false);
		nf.setMaximumFractionDigits(4);
		System.out.println(nf.format(number));
		
		Locale brLocale = Locale.forLanguageTag("pt-BR");
		NumberFormat nfBr = NumberFormat.getNumberInstance(brLocale);
		nfBr.setGroupingUsed(true);
		nfBr.setMaximumFractionDigits(2);
		System.out.println(nfBr.format(number));		
		
		// R$ 349,90
		// Usando Locale.UK: £349.90
		nf = NumberFormat.getCurrencyInstance(brLocale);
		System.out.println(nf.format(349.90));
		// 81%
		nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(17f / 21f));

	}

}
