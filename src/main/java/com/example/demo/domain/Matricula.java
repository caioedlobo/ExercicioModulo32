package com.example.demo.domain;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)     // aprendi em outros cursos assim
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="matri_seq")
    @SequenceGenerator(name="matri_seq", sequenceName ="sq_matricula", initialValue = 1, allocationSize = 1)
    //sequenceName é o nome da Sequência que vai ser criado no banco de dados
    //initialValue e allocationSize, siginfica que vai começar de 1 e vai incrementar de um em um
    // se o allocationSize fosse pro exemplo 10, ficaria assim a sequência: 1, 11, 21, 31, 41...
    private Long id;

    @Column(name="CODIGO", length = 10, nullable = false, unique = true)       //acredito que não rpecisa colocar nas outras columnas, indetifica automaticamente
    //o unique já adiciona a constraint que ele é unico
    private String codigo;

    @Column(name="DATA_MATRICULA", nullable = false)
    private Instant dataMatricula;

    @Column(name="VALOR", nullable = false)
    private Double valor;

    @Column(name="STATUS", nullable = false)
    private String status;

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

    public Instant getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Instant dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
