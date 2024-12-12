package org.example;

public class CasaComPiscina implements  CasaBuilder{


    private Casa casa = new Casa();

    @Override
    public void builderParedes() {
        System.out.println("Olha o Tijolo");
    }

    @Override
    public void builderPortas() {
        System.out.println(" Portas");
    }

    @Override
    public void builderJanelas() {
        System.out.println("Janelas");
    }

    @Override
    public void builderTelhado() {

    }

    @Override
    public void builderGaragem() {

    }

    @Override
    public void builderPiscina() {
        System.out.println("Piscina");
    }

    @Override
    public Casa getResultado() {
        return null;
    }
}
