package program;

import java.io.FileInputStream;
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

          System.out.println("Leu: [" + token + "]");

          String token = lineScanner.next();

          String token = lineScanner.next();

          String token = lineScanner.next();

          String token = lineScanner.next();

          Aluno a = new Aluno(0, 0, null, 0);
          alunos.add(a);
        }

      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
