package controller;

import model.Cachorro;
import view.CadastroCachorroView;
import java.time.LocalDate;

public class CadastroCachorroController {
    private CadastroCachorroView view;

    public CadastroCachorroController(CadastroCachorroView view) {
        this.view = view;
        this.view.setController(this);
    }

    public void salvarCachorro(String nome, String dataNascimentoStr, String tipoRaca) {
        if (nome.length() < 2) {
            view.exibirMensagem("Erro: Nome deve ter pelo menos 2 caracteres.");
            return;
        }
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        if (dataNascimento.isAfter(LocalDate.now())) {
            view.exibirMensagem("Erro: Data de nascimento não pode ser futura.");
            return;
        }
        Cachorro cachorro = new Cachorro(nome, dataNascimento, tipoRaca);
        // Persistir o cachorro (chamar o repositório)
        view.exibirMensagem("Cadastro realizado com sucesso!");
    }

    public void cancelarCadastro() {
        view.fechar();
    }
}