package db1Poo;

public class Materia {
    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer qtdAulas;
    public Professor professor;

    public Materia(String nome, String descricao, Double cargaHoraria, Integer qtdAulas, Professor professor) {
        if(nome == null){
            throw new CampoNaoPodeSerNulo("O campo nome não pode ser nulo ");
        }

        if(descricao == null){
            throw new CampoNaoPodeSerNulo("O campo descrição não pode ser nulo ");
        }

        if(cargaHoraria == null){
            throw new CampoNaoPodeSerNulo("O campo cargaHoraria não pode ser nulo ");
        }

        if(qtdAulas == null){
            throw new CampoNaoPodeSerNulo("O campo qtdAulas não pode ser nulo ");
        }

        if(professor == null){
            throw new CampoNaoPodeSerNulo("O campo professor não pode ser nulo ");
        }


        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.qtdAulas = qtdAulas;
        this.professor = professor;
    }


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
