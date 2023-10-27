package com.betrybe.sistemadevotacao;

/**
 * javadoc.
 */
public class PessoaEleitora extends Pessoa{
  private String cpf;

  public PessoaEleitora(String cpf, String nome) {
    super.nome = nome;
    this.cpf = cpf;
  }

  public String getCPF() {
    return cpf;
  }

  public void setCPF(String cpf) {
     this.cpf = cpf;
  }
}
