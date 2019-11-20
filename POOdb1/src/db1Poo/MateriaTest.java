package db1Poo;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

//    @Test
//    public void deveJogarExceptionComNomeNulo(){
//        String nome = "Fake";
//        try {
//            Materia materia = new Materia(null,"aatata",10.5,10,professor);
//        }  catch(CampoNaoPodeSerNulo naoPodeSerNulo) {
//            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
//        }
//    }


    @Test
    public void deveCriarMateriaPorMeioDoConstrutor(){

        String nome = "POO";
        String descricao = "Fake";
        Double cargaHoraria = 10.5;
        Integer qtdAulas = 3;
        Professor professor = new Professor("Bruno","bruninhorodrigues14@gmail.com");

        Materia materia = new Materia(nome,descricao,cargaHoraria,qtdAulas,professor);

        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(qtdAulas, materia.getQtdAulas());
        Assert.assertEquals(professor,materia.getProfessor());

    }
}
