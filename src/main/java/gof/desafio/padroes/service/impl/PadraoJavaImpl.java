package gof.desafio.padroes.service.impl;

import gof.desafio.padroes.model.padrao.facede.Facede;
import gof.desafio.padroes.model.padrao.singleton.SingletonEager;
import gof.desafio.padroes.model.padrao.singleton.SingletonLazy;
import gof.desafio.padroes.model.padrao.singleton.SingletonLazyHolder;
import gof.desafio.padroes.model.padrao.strategy.Comportamento;
import gof.desafio.padroes.model.padrao.strategy.impl.Carro;
import gof.desafio.padroes.model.padrao.strategy.impl.ComportamentoDevagar;
import gof.desafio.padroes.model.padrao.strategy.impl.ComportamentoNormal;
import gof.desafio.padroes.model.padrao.strategy.impl.ComportamentoRapido;
import gof.desafio.padroes.service.PadraoJavaService;
import gof.desafio.padroes.sistema.SistemaCrm;
import org.springframework.stereotype.Service;

@Service
public class PadraoJavaImpl implements PadraoJavaService {
    @Override
    public String sigletonEager(){
        String[] memoria = new String[2];
        SingletonEager eager = SingletonEager.getInstancia();
        memoria[0] = eager.toString();
        eager = SingletonEager.getInstancia();
        memoria[1] = eager.toString();
        return String.format("Eager 1: %s   Eager 2: %s",memoria[0],memoria[1]);
    }

    @Override
    public String singletonLazy(){
        String[] memoria = new String[2];
        SingletonLazy lazy = SingletonLazy.getInstancia();
        memoria[0] = lazy.toString();
        lazy = SingletonLazy.getInstancia();
        memoria[1] = lazy.toString();
        return String.format("Lazy 1: %s   Lazy 2: %s",memoria[0],memoria[1]);
    }

    @Override
    public String singletonLazyHolder(){
        String[] memoria = new String[2];
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        memoria[0] = lazyHolder.toString();
        lazyHolder = SingletonLazyHolder.getInstancia();
        memoria[1] = lazyHolder.toString();
        return String.format("LazyHolder 1: %s   LazyHolder 2: %s",memoria[0],memoria[1]);
    }

    @Override
    public String carro() {
        String[] memoria = new String[3];
        Comportamento devagar = new ComportamentoDevagar();
        Comportamento normal = new ComportamentoNormal();
        ComportamentoRapido rapido = new ComportamentoRapido();
        Carro carro = new Carro();
        carro.setComportamento(normal);
        memoria[0] = carro.mover();
        carro.setComportamento(devagar);
        memoria[1] = carro.mover();
        carro.setComportamento(rapido);
        memoria[2] = carro.mover();
        return String.format("Movimento 1: %s, Movimento 2: %s, Movimento 3: %s", memoria[0], memoria[1], memoria[2]);
    }

    @Override
    public String facede(String nome, String cep){
        Facede facede = new Facede();
        return facede.migrarFuncionario(nome, cep);
    }
}
