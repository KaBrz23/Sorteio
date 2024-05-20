package com.example.sorteio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sorteio.model.Sorteio;
import com.example.sorteio.repository.SorteioRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("dado")
@Tag(name = "Sorteio", description = "Categorias de Sorteio")
public class SorteioController {

    @Autowired
    private SorteioRepository repository;

    @GetMapping
    @Operation(
        summary = "Sortear número até 6",
        description = "Retorna um número aleatório entre 1 e 6"
    )
    public Sorteio sortearDado(){
        int dado = repository.gerarNumero();
        return new Sorteio(dado);
    }

    @GetMapping("/{maximo}")
    @Operation(
        summary = "Sortear até um número personalizado",
        description = "Retorna um número aleatório entre 1 e o número máximo definido"
    )
    public Sorteio sortearDado(@PathVariable int maximo){
        int dado = repository.gerarNumero(maximo);
        return new Sorteio(dado);
    }
    
}