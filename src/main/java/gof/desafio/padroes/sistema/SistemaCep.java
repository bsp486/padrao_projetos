package gof.desafio.padroes.sistema;

public class SistemaCep {
    private static SistemaCep sistemaCep = new SistemaCep();

    private SistemaCep(){}

    public static SistemaCep getInstancia() {
        return sistemaCep;
    }

    public String recuperaCidade(String cep) {
        if (cep.equals("25870000")) {
            return "Comendador Levy Gasparian";
        }
        else {
            return "Juiz de Fora";
        }
    }

    public String recuperaEstado(String cep) {
        if(cep.equals("25870000")){
            return "RJ";
        }
        else {
            return "MG";
        }
    }
}
