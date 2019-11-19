package db1Poo;

public class Materia {
    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer qtdAulas;
    public Professor professor;


    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public Double getCargaHoraria(){
        return cargaHoraria;
    }

    public Integer getQtdAulas(){
        return qtdAulas;
    }

    public Professor getProfessor(){
        return professor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", qtdAulas=" + qtdAulas +
                ", professor=" + professor +
                '}';
    }
}
