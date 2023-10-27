package com.betrybe.sistemadevotacao;

/**
 * javadoc.
 */
public class PessoaCandidata extends Pessoa {
  public int numero;
  public int votos;

  /**
    * Getters and Setters.
    */

  public PessoaCandidata(String nome, int numeros) {
    super.nome = nome;
    this.numero = numeros;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setNumero(int numeros) {
    this.numero = numeros;
  }

  public void receberVoto() {
    this.votos++;
  }
}
