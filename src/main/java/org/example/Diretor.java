package org.example;

public class Diretor {

    private CasaBuilder casaBuilder;

    public Diretor(CasaBuilder casaBuilder) {
        this.casaBuilder = casaBuilder;
    }

    public void constroiCasaComPiscina(int paredes, int portas, int janeas){

        casaBuilder.builderParedes();
        casaBuilder.builderJanelas();
        casaBuilder.builderPortas();
        casaBuilder.builderTelhado();
        casaBuilder.builderPiscina();
    }

}
