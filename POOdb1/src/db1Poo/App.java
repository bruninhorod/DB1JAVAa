package db1Poo;

import java.util.ArrayList;
import java.util.Date;

public class App {

    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Bruno" , "bruninhorodrigues14@gmail.com");
        Aluno aluno2 = new Aluno("Pedro" , "pedrinho14@gmail.com");
        Professor professor1 = new Professor("Igor","igor.santos@db1.com.br");


        Materia materia1 = new Materia();
        materia1.nome = "POO";
        materia1.descricao = "Abstração, encapsulamento, polimorfismo e herança";
        materia1.cargaHoraria = 10.5;
        materia1.qtdAulas = 3;
        materia1.professor = professor1;

        Aula aula = new Aula();
        aula.dataAula = new Date();
        aula.materia = materia1;
        aula.alunos = new ArrayList<Aluno>();
        aula.alunos.add(aluno1);
        aula.alunos.add(aluno2);

        System.out.println("A aula de hoje é: " + aula);

        aula.alunos = null;

        System.out.println(aula);
    }

}
