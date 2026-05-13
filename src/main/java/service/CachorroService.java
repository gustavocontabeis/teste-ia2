package service;

import model.Cachorro;
import java.util.ArrayList;
import java.util.List;

public class CachorroService {
    private List<Cachorro> cachorros = new ArrayList<>();

    public void cadastrarCachorro(Cachorro cachorro) {
        cachorros.add(cachorro);
    }
}