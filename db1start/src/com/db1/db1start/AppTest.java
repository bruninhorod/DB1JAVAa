package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class AppTest {

    @Test
    public void deveRetornar5() {
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar10() {
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.subtracao(20, 10);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar20() {
        Application application = new Application();
        Integer expected = 20;
        Integer response = application.multiplicacao(2, 10);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar50() {
        Application application = new Application();
        Integer expected = 50;
        Integer response = application.divisao(100, 2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarEhPar() {
        Application application = new Application();
        String expected = "é par";
        String response = application.retornaParOuNao(100);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornaroMaior() {
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.retornaMaior(10, 5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarNumerosImpares() {
        Application application = new Application();
        Integer expected = 50;
        Integer response = application.retornaQtdNumerosImpares(100);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarLetrasMaiusculas() {
        Application application = new Application();
        String expected = "ADULTO";
        String response = application.retornaMaiusculo("adulto");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarMinusculas() {
        Application application = new Application();
        String expected = "adulto";
        String response = application.retornaMinusculo("ADULTO");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQtdLetras() {
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.retornaQtdLetras("DB1START");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQtdLetrasEspaço(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.retornaQtdLetrasSemEspaco(" DB1START ");
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveRetornarPalavraSemEspaco(){
        Application application = new Application();
        String expected = "DB1START";
        String response = application.retornaPalavraSemEspaco(" DB1START ");
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveRetornar4PrimeirasLetras(){
        Application application = new Application();
        String expected = "Brun";
        String response = application.retorna4PrimeirasLetras("Bruno Nascimento Rodrigues");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveRetonarApos3(){
        Application application = new Application();
        String expected = "no Rodrigues";
        String response = application.retornaApos3("Bruno Rodrigues");
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveRetornar4Ultimas(){
        Application application = new Application();
        String expected = "gues";
        String response = application.retorna4Ultimas("Bruno Rodrigues");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveSubstituirPrimeiroNome(){
        Application application = new Application();
        String expected = "Aluno Rodrigues";
        String response = application.trocaPrimeiroNome("Bruno Rodrigues");
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveExibirTextoSeparadamente(){
        Application application = new Application();
        String[] expected = new String[]("banana" , "maçã" , "melancia");
        String[] response = application.retornaTextoSeparadamente("banana, maçã, melancia");
        Assert.assertArrayEquals(expected,response);

    }

    @Test
    public void deveContarVogais(){
        Application application = new Application();
        Integer expected = 6;
        Integer response = application.contaVogais("Bruno Rodrigues");
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveInverterTexto(){
        Application application = new Application();
        String expected = "onurb";
        String response = application.retornaInvertido("bruno");
        Assert.assertEquals(expected,response);

    }


    @Test
    public void deveRetornarMenor(){
        Application application = new Application();
        Double expected = 5.05;
        Double response = application.retornaMenorValor(5.05,10.05);
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveRetornarMenorDeTodos(){
        Application application = new Application();
        Double expected = 2.05;
        Double response = application.retornamMenorValorDeTodos(5.05,10.05,2.05);
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveRetornarMedia(){
        Application application = new Application();
        Double expected = 5.0;
        Double response = application.retornaMedia(10.0,5.0,0.0);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void deveCalcularAreaDeTriangulo(){
        Application application = new Application();
        Double expected = 5.0;
        Double response = application.calculaAreaTringulo(5.0,2.0);
        Assert.assertEquals(expected,response);
    }



}
