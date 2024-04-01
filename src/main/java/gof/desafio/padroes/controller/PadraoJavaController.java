package gof.desafio.padroes.controller;

import gof.desafio.padroes.service.PadraoJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("padrao")
public class PadraoJavaController {

    @Autowired
    PadraoJavaService padraoJavaService;
    @GetMapping("/singletonEager")
    public String singletonEager() {
        return padraoJavaService.sigletonEager();
    }

    @GetMapping("/singletonLazy")
    public String singletonLazy(){
        return padraoJavaService.singletonLazy();
    }

    @GetMapping("/SingletonLazyHolder")
    public String SingletonLazyHolder(){
        return padraoJavaService.singletonLazyHolder();
    }

    @GetMapping("/strategy")
    public String carro(){
        return padraoJavaService.carro();
    }

    @GetMapping("/facede/{nome}/{cep}")
    public String Facede(@PathVariable String nome, @PathVariable String cep){
        return padraoJavaService.facede(nome,cep);
    }
}
