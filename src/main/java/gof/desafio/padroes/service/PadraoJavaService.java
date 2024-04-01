package gof.desafio.padroes.service;

public interface PadraoJavaService {
    String sigletonEager();

    String singletonLazy();

    String singletonLazyHolder();

    String carro();

    String facede(String nome, String cep);
}
