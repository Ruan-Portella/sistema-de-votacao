package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * javadoc.
 */

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  ArrayList<String> cpfsComputados = new ArrayList<String>();

  /**  
   * Métodos.
   */

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(novaPessoaCandidata);
  }

  /**  
   * Métodos.
   */

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(novaPessoaEleitora);
  }
  
  /**  
   * Métodos.
   */

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
        pessoaCandidata.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
      } else {
        System.out.println("Pessoa candidata não encontrada!");
      }
    }
  }

  /**  
   * Métodos.
   */

  public void mostrarResultado() {
    int totalVotos = cpfsComputados.size();
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      int porcentagemVotos = Math.round((float) pessoaCandidata.getVotos() / totalVotos * 100);
      System.out.println(
            "Nome: " + pessoaCandidata.getNome() + " - " + pessoaCandidata.getVotos() 
          + " votos ( " + porcentagemVotos + "% )");
    }
    System.out.println("Total de votos: " + totalVotos);
  }
}
