package db1Poo;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AulaTest {

    @Test
    public void deveCriarAulaPorMeiodoConstrutor() {

        Aluno aluno1 = new Aluno("tercio25@gmail.com", "Tercio Rodrigues");
        Aluno aluno2 = new Aluno( "joaosilva@gmail.com", "João Silva");
        Professor professor = new Professor ( "igorsantos@gmail.com", "Igor Santos");

        Materia materia = new Materia("Materia Test", "Descrição Materia", 10.5, 10,professor);

        Date data = new Date();
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        Aula aula = new Aula(data, materia, alunos);

        Assert.assertEquals(data, aula.getDataAula());
        Assert.assertEquals(materia, aula.getMateria());
        Assert.assertEquals(alunos, aula.getAlunos());
    }
}
