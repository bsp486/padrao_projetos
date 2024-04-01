package gof.desafio.padroes.model.padrao.strategy.impl;

import gof.desafio.padroes.model.padrao.strategy.Comportamento;

public class ComportamentoRapido implements Comportamento{
    public ComportamentoRapido(){

    }

    public String mover(){
        return "Movendo-se rapidamente...";
    }
}
