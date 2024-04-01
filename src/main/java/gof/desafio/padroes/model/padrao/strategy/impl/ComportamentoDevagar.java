package gof.desafio.padroes.model.padrao.strategy.impl;

import gof.desafio.padroes.model.padrao.strategy.Comportamento;

public class ComportamentoDevagar implements Comportamento {
    public ComportamentoDevagar(){

    }

    public String mover(){
        return "Movendo-se vagarosamente...";
    }
}
