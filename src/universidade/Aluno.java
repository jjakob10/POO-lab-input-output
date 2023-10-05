package universidade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

  private int matricula;

  private String nome;

  private float cr;

  private LocalDate nascimento;

  private float rendaFamiliar;

  public Aluno(String nome, int matricula, float cr, LocalDate nascimento, float rendaFamiliar) {
    this.nome = nome;
    this.matricula = matricula;
    this.cr = cr;
    this.nascimento = nascimento;
    this.rendaFamiliar = rendaFamiliar;
  }

  public String getNome() {
    return nome;
  }

  public float getRendaFamiliar() {
    return rendaFamiliar;
  }

  public LocalDate getNascimento() {
    return nascimento;
  }

  public float getCr() {
    return cr;
  }

  public int getMatricula() {
    return matricula;
  }

  @Override
  public String toString() {
    return "Nome:" + this.nome + " Matrícula:" + this.matricula + " CR:" + this.cr + " nascimento:"
        + this.nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yy"))
        + " Renda familiar:" + this.rendaFamiliar;
  }
}
