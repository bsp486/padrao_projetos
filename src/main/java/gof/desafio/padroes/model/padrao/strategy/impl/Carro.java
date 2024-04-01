package gof.desafio.padroes.model.padrao.strategy.impl;

import gof.desafio.padroes.model.padrao.strategy.Comportamento;

public class Carro {
    private Comportamento comportamento;

    public Carro(){};

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public String mover(){
        return this.comportamento.mover();
    }


}
