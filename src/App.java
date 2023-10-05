import java.io.FileInputStream;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import universidade.Aluno;

public class App {
  public static void main(String[] args) {

    Locale brLocale = Locale.forLanguageTag("pt-BR");
    NumberFormat nf = NumberFormat.getInstance(brLocale);

    List<Aluno> alunos = new LinkedList<>();

    System.out.println("Lendo Arquivo CSV:");
    try (FileInputStream fin = new FileInputStream("data/entrada.csv");
        Scanner s = new Scanner(fin, "ISO-8859-1")) {
      while (s.hasNextLine()) {
        String line = s.nextLine();
        System.out.println("Processando linha: " + line);
        try (Scanner lineScanner = new Scanner(line)) {
          lineScanner.useDelimiter(";");

          int matricula = nf.parse(lineScanner.next()).intValue();

          String nome = lineScanner.next();

          float cr = nf.parse(lineScanner.next()).floatValue();

          LocalDate nascimeno = LocalDate.parse(lineScanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

          float renda = nf.parse(lineScanner.next()).floatValue();

          Aluno a = new Aluno(nome, matricula, cr, nascimeno, renda);
          alunos.add(a);
        }

      }
    } catch (ParseException e) {
      System.out.println("Formato Inválido!");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("");
    for (Aluno a : alunos) {
      System.out.println(a.toString());
    }
  }
}
