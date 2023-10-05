package program;

import java.time.LocalDate;

public class Aluno {

  private int matricula;

  private String nome;

  private float cr;

  private LocalDate nascimento;

  private float rendaFamiliar;

  public Aluno(String nome, int matricula, float cr, LocalDate nascimento, float rendaFamiliar) {
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
}
