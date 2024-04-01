package gof.desafio.padroes.model.padrao.facede;

import gof.desafio.padroes.sistema.SistemaCep;
import gof.desafio.padroes.sistema.SistemaCrm;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Facede {

    public String migrarFuncionario(String nome, String cep){
        String cidade = SistemaCep.getInstancia().recuperaCidade(cep);
        String estado = SistemaCep.getInstancia().recuperaCidade(cep);
        return SistemaCrm.gravarFuncionario(nome, cep, cidade, estado);
    }

}
