package db1Poo;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test
    public void deveJogarExceptionComNomeNulo(){
        String nome = "Fake";
        try {
            Professor professor = new Professor (null, nome);
        }  catch(CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComEmailNulo(){
        String email = "Fake@gmail.com";
        try {
            Professor professor = new Professor (email,null);
        }  catch(CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarProfessorPorMeioDoConstrutor(){
        String email = "fake@email.com";
        String nome = "Professor";

        Professor professor = new Professor(nome,email);

        Assert.assertEquals(nome, professor.getNome());
        Assert.assertEquals(email, professor.getEmail());

    }
}
