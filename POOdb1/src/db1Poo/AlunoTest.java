package db1Poo;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {

    @Test
    public void deveJogarExceptionComNomeNulo(){
        String email = "Fake";
        try {
            Aluno aluno = new Aluno(null, email);
        }  catch(CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComEmailNulo(){
        String email = "Fake@gmail.com";
        try {
            Aluno aluno = new Aluno(email, null);
        }  catch(CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
//    @Test
//    public void deveAdicionarAlunoNaChamada(){
//        String nome = "brunin";
//        String email = "Email@email.com";
//        Date dataAula = new Date();
//        Aluno aluno = new Aluno(email, nome);
//        Materia materia = new Materia =
//    }

    @Test
    public void deveCriarAlunoPorConstrutor(){

        String email = "teste@teste.com";
        String nome = "fakee";

        Aluno aluno1 = new Aluno(nome,email);

        Assert.assertEquals(nome, aluno1.getNome());
        Assert.assertEquals(email, aluno1.getEmail());
    }
}
