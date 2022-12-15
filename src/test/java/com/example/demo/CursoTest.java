package com.example.demo;


import com.example.demo.dao.CursoDao;
import com.example.demo.dao.ICursoDao;
import com.example.demo.domain.Curso;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDao cursoDao = new CursoDao();

    @Test
    public void cadastrar(){
        Curso curso = new Curso();

        curso.setCodigo("A2");
        curso.setDescricao("Curso teste 2");
        curso.setNome("Curso de Java backend 2");
        curso = cursoDao.cadastrar(curso);
        System.out.println(curso.getId());
        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
