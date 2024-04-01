package gof.desafio.padroes.sistema;

public class SistemaCrm {
    private SistemaCrm(){}

    public static String gravarFuncionario(String nome, String cep, String cidade, String estado){
        return String.format("Cliente salvo >> Nome: %s, Cep: %s, Cidade: %s, UF: %s", nome, cep, cidade, estado);
    }
}
