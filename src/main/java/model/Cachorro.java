package model;

import java.time.LocalDate;

public class Cachorro {
    private String nome;
    private LocalDate dataNascimento;
    private String tipoRaca;

    public Cachorro(String nome, LocalDate dataNascimento, String tipoRaca) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoRaca = tipoRaca;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoRaca() {
        return tipoRaca;
    }

    public void setTipoRaca(String tipoRaca) {
        this.tipoRaca = tipoRaca;
    }
}