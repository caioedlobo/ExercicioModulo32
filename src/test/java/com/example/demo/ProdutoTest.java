package com.example.demo;

import com.example.demo.dao.IProdutoDao;
import com.example.demo.dao.ProdutoDao;
import com.example.demo.domain.Produto;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class ProdutoTest {
    IProdutoDao produtoDao = new ProdutoDao();
    @Test
    public void cadastrar(){
        Produto prod = new Produto();
        prod.setCodigo("A1");
        prod.setNome("Camisa");

        prod = produtoDao.cadastrar(prod);
        assertNotNull(prod);
        assertNotNull(prod.getId());
    }
}
