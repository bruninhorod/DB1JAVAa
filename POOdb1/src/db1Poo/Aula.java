package db1Poo;

import java.util.Date;
import java.util.List;

public class Aula {
    public Date dataAula;
    public Materia materia;
    public List<Aluno> alunos;

    @Override
    public String toString() {
        return "Aula{" +
                "dataAula=" + dataAula +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}
