package db1java;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App {
   public static List<String> cores = new ArrayList<>();

    public static void main(String[] args) {

        //Exercício 1 e
        retornaCores();

        //Exercício 2
        System.out.println("Quantidade de cores: "+ retornaQtd().toString());

        //Exercício 3
        System.out.print("Removendo a segunda posição: ");
        System.out.println(removeSegundaPosicao().toString());

        //Exercício 4
        System.out.print("Imprimindo o primeiro método: ");
        imprimeCores();

        //Exercício 5


    }


    public static List<String> retornaCores() {

        cores.add("Branco");
        cores.add("Preto");
        cores.add("Azul");
        cores.add("Vermelho");

        return cores;

    }

    public static List<String> removeSegundaPosicao(){

        cores.remove(1);
        return cores;
    }

    public static Integer retornaQtd(){

        return(cores.size());
    }

    public static void imprimeCores(){

        cores.removeAll(Arrays.asList("Branco","Azul","Vermelho"));
        retornaCores();
        System.out.println(cores);
    }

    public static void imprimeOrdenada(){

        cores.compareTo
    }
}



