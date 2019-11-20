package db1Poo;

public class CampoNaoPodeSerNulo extends RuntimeException{

    public CampoNaoPodeSerNulo(String frase){

        super(frase);
    }
}
