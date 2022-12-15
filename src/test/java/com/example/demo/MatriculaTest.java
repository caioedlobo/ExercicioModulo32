package com.example.demo;


import com.example.demo.dao.IMatriculaDao;
import com.example.demo.dao.MatriculaDao;
import com.example.demo.domain.Matricula;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

    private IMatriculaDao matriculaDao = new MatriculaDao();

    @Test
    public void cadastrar(){
        Matricula mat = new Matricula();
        mat.setCodigo("A!");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat = matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());


    }
}
