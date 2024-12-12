package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        CasaComPiscina builderCasaComPiscina = new CasaComPiscina();

        Diretor diretor = new Diretor(builderCasaComPiscina);

        diretor.constroiCasaComPiscina(103, 25 , 45);

        Casa casa = builderCasaComPiscina.getResultado();

        System.out.println(casa);

    }
}