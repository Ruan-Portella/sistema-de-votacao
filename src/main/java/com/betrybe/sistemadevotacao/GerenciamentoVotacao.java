package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

/**
 * javadoc.
 */
public abstract class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  ArrayList<String> cpfsComputados = new ArrayList<>();

  /**  
   * Métodos.
   */

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
      } else {
        PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
        pessoasCandidatas.add(novaPessoaCandidata);
      }
    }
  }

  /**  
   * Getters and Setters.
   */

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
      } else {
        PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
        pessoasEleitoras.add(novaPessoaEleitora);
      }
    }
  }

  /**  
   * Métodos.
   */

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpf : cpfsComputados) {
      if (Objects.equals(cpf, cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
      } else {
        for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
          if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
            pessoaCandidata.receberVoto();
            cpfsComputados.add(cpfPessoaEleitora);
          } else {
            System.out.println("Pessoa candidata não encontrada!");
          }
        }
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
    } else {
      for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
        int porcentagemVotos = Math.round((float) pessoaCandidata.getVotos() / totalVotos * 100);
        System.out.println("Nome: " + pessoaCandidata.getNome() + " - " 
            + pessoaCandidata.getVotos() + " votos ( " + porcentagemVotos + "% )");
        System.out.println("Total de Votos: " + totalVotos);
      }
    }
  }
}
