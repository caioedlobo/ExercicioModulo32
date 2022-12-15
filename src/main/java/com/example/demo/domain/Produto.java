package com.example.demo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    //@SequenceGenerator(name="produto_seq", sequenceName ="sq_produto", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CODIGO", nullable = false)
    private String codigo;
    @Column(name = "NOME", nullable = false)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
