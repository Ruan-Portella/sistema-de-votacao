package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
    public int numeros;
    public int votos;

    public PessoaCandidata(String nome, int numeros) {
        super.nome = nome;
        this.numeros = numeros;
        this.votos = 0;
    }

    public int getNumeros() {
        return numeros;
    }

    public int getVotos() {
        return votos;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public void receberVoto() {
        this.votos++;
    }
}
