package db1Poo;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void deveCriarProfessorPorMeioDoConstrutor(){

        String nome = "teste";
        String descricao = "Fake";
        Double cargaHoraria = 10.5;
        Integer qtdAulas = 3;


        Materia materia = new Materia(nome,descricao,cargaHoraria,qtdAulas);

        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(qtdAulas, materia.getQtdAulas());

    }


}
