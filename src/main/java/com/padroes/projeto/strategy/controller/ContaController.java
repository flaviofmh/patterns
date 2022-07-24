package com.padroes.projeto.strategy.controller;

import com.padroes.projeto.strategy.dtos.PessoaCadastro;
import com.padroes.projeto.strategy.entities.Conta;
import com.padroes.projeto.strategy.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PostMapping
    public Conta registrar(@RequestBody PessoaCadastro pessoaCadastro) {
        return contaService.registrarConta(pessoaCadastro);
    }

}
