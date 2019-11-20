package db1Poo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {

    public Date dataAula;
    public Materia materia;
    public List<Aluno> alunos = new ArrayList<Aluno>();

    public Aula(Date dataAula, Materia materia, List<Aluno> alunos){

        if (dataAula == null){
            throw new CampoNaoPodeSerNulo("Data da aula não pode ser nula");
        }
        this.dataAula = dataAula;
        this.materia = materia;

    }

    public void darPresenca(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Date getDataAula() {
        return dataAula;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "dataAula=" + dataAula +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}
