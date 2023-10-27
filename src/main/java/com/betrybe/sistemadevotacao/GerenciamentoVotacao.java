package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * javadoc.
 */
public abstract class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  ArrayList<String> pessoasCandidatas = new ArrayList<String>();
  ArrayList<String> pessoasEleitoras = new ArrayList<String>();
  ArrayList<String> cpfsComputados = new ArrayList<String>();
}
