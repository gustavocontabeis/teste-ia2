package model;

import java.util.Date;

public class Cachorro {
    private String nome;
    private Date dataNascimento;
    private String tipoRaca;

    public Cachorro(String nome, Date dataNascimento, String tipoRaca) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoRaca = tipoRaca;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public Date getDataNascimento() { return dataNascimento; }
    public String getTipoRaca() { return tipoRaca; }
}