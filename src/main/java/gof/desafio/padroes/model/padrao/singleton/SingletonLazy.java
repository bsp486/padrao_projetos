package gof.desafio.padroes.model.padrao.singleton;

public class SingletonLazy {
    private static SingletonLazy instancia1;

    private SingletonLazy(){}


    public static SingletonLazy getInstancia() {
        if (instancia1 == null) {
            instancia1 = new SingletonLazy();
        }

        return instancia1;
    }
}
