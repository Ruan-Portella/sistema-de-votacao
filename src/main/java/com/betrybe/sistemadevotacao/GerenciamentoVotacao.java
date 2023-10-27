package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * javadoc.
 */
public abstract class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  ArrayList<String> cpfsComputados = new ArrayList<>();

  /**  
   * Getters and Setters.
   */

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.numeros == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
       } else {
         PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
         pessoasCandidatas.add(novaPessoaCandidata);
       }
     }
   }

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf() == cpf) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
       } else {
         PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
         pessoasEleitoras.add(novaPessoaEleitora);
       }
     }
   }
}
