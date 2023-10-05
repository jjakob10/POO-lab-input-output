package program;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

public class CSVReader {
  public static void main(String[] args) {

    HashSet<Aluno> alunos = new HashSet<>();

    System.out.println("Lendo Arquivo CSV:");
    try (FileInputStream fin = new FileInputStream("data/entrada.csv");
        Scanner s = new Scanner(fin, "ISO-8859-1")) {
      while (s.hasNextLine()) {
        String line = s.nextLine();
        System.out.println("Processando linha: " + line);
        try (Scanner lineScanner = new Scanner(line)) {
          lineScanner.useDelimiter(";");

          String token = lineScanner.next();

          int matricula = 0;

          String nome = lineScanner.next();

          token = lineScanner.next();

          float cr;

          token = lineScanner.next();

          LocalDate nascimeno;

          token = lineScanner.next();

          float renda = 0;

          Aluno a = new Aluno(nome, matricula, cr, nascimeno, renda);
          alunos.add(a);
        }

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
