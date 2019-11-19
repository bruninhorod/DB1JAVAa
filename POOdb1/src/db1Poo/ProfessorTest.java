package db1Poo;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test
    public void deveCriarProfessorPorMeioDoConstrutor(){
        String email = "fake@email.com";
        String nome = "fake";

        Professor professor = new Professor(nome,email);

        Assert.assertEquals(nome, professor.getNome());
        Assert.assertEquals(email, professor.getEmail());

    }
}
