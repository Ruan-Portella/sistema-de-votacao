package com.betrybe.sistemadevotacao;

/**
  * javadoc.
  */

public class PessoaEleitora extends Pessoa {
  private String cpf;

  
  public PessoaEleitora(String cpf, String nome) {
    super.nome = nome;
    this.cpf = cpf;
  }
  
  /**
    * Getters and Setters.
    */
  
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
