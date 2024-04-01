package gof.desafio.padroes.model.padrao.strategy.impl;

import gof.desafio.padroes.model.padrao.strategy.Comportamento;

public class ComportamentoNormal implements Comportamento {
    public ComportamentoNormal() {

    }

    public String mover(){
        return "Movendo-se normalmente...";
    }
}
