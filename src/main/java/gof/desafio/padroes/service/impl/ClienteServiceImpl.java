package gof.desafio.padroes.service.impl;

import gof.desafio.padroes.model.Cliente;
import gof.desafio.padroes.model.Endereco;
import gof.desafio.padroes.repository.ClienteRepository;
import gof.desafio.padroes.repository.EnderecoRepository;
import gof.desafio.padroes.service.ClienteService;
import gof.desafio.padroes.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.accessibility.AccessibleEditableText;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if(cliente.isEmpty()){
            return null;
        }
        return cliente.get();
    }
    @Override
    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }
    @Override
    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Optional<Endereco> enderecoDoCep = enderecoRepository.findById(cep);
        Endereco endereco;
        if(enderecoDoCep.isEmpty()){
            endereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(endereco);
        }
        else {
            endereco = enderecoDoCep.get();
        }
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
