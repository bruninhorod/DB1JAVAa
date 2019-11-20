package db1Poo;

import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Bruno" , "bruninhorodrigues14@gmail.com");
        Aluno aluno2 = new Aluno("Pedro" , "pedrinho14@gmail.com");
        Professor professor = new Professor("Igor","igor.santos@db1.com.br");


        String nome = "Poo";
        String descricao = "Abstração";
        Double cargaHoraria = 10.5;
        Integer qtdAulas = 3 ;
        Materia materia = new Materia(nome, descricao, cargaHoraria, qtdAulas, professor);



        Aula aula = new Aula();
        aula.dataAula = new Date();
        aula.materia = materia;
        aula.alunos = new ArrayList<Aluno>();
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);

        System.out.println("A aula de hoje é: " + aula);

        aula.alunos = null;

        System.out.println(aula);
    }

}
