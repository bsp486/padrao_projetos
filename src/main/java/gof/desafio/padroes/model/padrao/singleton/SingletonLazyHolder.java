package gof.desafio.padroes.model.padrao.singleton;

public class SingletonLazyHolder {
    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia() {
        return SingletonLazyHolder.InstanceHolder.instancia;
    }

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

        private InstanceHolder() {
        }
    }
}
