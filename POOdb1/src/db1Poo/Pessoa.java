package db1Poo;

public abstract class Pessoa {

    private String nome;
    private String email;



    public Pessoa(String nome, String email){
        if (email == null){
            throw new CampoNaoPodeSerNulo("Email não pode ser nulo");
        }
        if (nome == null){
            throw new CampoNaoPodeSerNulo("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.email = email;
    }


    public String getEmail(){
        return email;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
