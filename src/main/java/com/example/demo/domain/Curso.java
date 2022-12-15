package com.example.demo.domain;

import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table(name="TB_CURSO")
public class Curso {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)     // aprendi em outros cursos assim
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="curso_seq")
    @SequenceGenerator(name="curso_seq", sequenceName ="sq_curso", initialValue = 1, allocationSize = 1)
    //sequenceName é o nome da Sequência que vai ser criado no banco de dados
    //initialValue e allocationSize, siginfica que vai começar de 1 e vai incrementar de um em um
    // se o allocationSize fosse pro exemplo 10, ficaria assim a sequência: 1, 11, 21, 31, 41...
    private Long id;
    @Column(name="CODIGO", length = 10, nullable = false, unique = true)       //acredito que não rpecisa colocar nas outras columnas, indetifica automaticamente
    //o unique já adiciona a constraint que ele é unico
    private String codigo;
    @Column(name="NOME", length = 50, nullable = false)
    private String nome;
    @Column(name="DESCRICAO", length = 100, nullable = false)
    private String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
