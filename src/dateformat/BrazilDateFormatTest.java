package dateformat;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class BrazilDateFormatTest {

	public static void main(String[] args) {

		// locale padrão, formato FULL 
		Date d = new Date();
		System.out.println(d);
		
		Locale brLocale = Locale.forLanguageTag("pt-BR");
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, brLocale);
		
		String formattedDate = df.format(d);
		System.out.println(formattedDate);
		
//			SHORT is completely numeric, such as 12.13.52 or 3:30pm
//			MEDIUM is longer, such as Jan 12, 1952
//			LONG is longer, such as January 12, 1952 or 3:30:32pm
//			FULL is pretty completely specified, such as Tuesday, April 12, 1952 AD or 3:30:42pm PST.

		formattedDate = (DateFormat.getDateInstance(DateFormat.MEDIUM, brLocale)).format(d);
		System.out.println(formattedDate);

		formattedDate = (DateFormat.getDateInstance(DateFormat.LONG, brLocale)).format(d);
		System.out.println(formattedDate);

		formattedDate = (DateFormat.getDateInstance(DateFormat.FULL, brLocale)).format(d);
		System.out.println(formattedDate);
				
		formattedDate = (DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY)).format(d);
		System.out.println(formattedDate);

		String formattedLocalDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(formattedLocalDate);
		
		LocalDate ld = LocalDate.parse("31/12/2019",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(ld);		
		System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yy")));		
		
	}

}
