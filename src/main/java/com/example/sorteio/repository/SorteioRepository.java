package com.example.sorteio.repository;

import java.util.Random;

import org.springframework.stereotype.Repository;

@Repository
public class SorteioRepository {
    private final Random random = new Random();

    
    public int gerarNumero(int maximo) {
        return random.nextInt(maximo) + 1;
    }

    public int gerarNumero() {
        return gerarNumero(6);
    }
}
