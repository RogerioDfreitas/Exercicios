package org.example;

public class Casa {

    private int janelas;

    private int portas;

    private int quartos;

    private int salas;

    private Boolean temGaragem;

    private Boolean temPiscina;

    private Boolean temJardim;


    public Casa(int janelas, int portas, int quartos, int salas, Boolean temGaragem, Boolean temJardim, Boolean temPiscina) {
        this.janelas = janelas;
        this.portas = portas;
        this.quartos = quartos;
        this.salas = salas;
        this.temGaragem = temGaragem;
        this.temJardim = temJardim;
        this.temPiscina = temPiscina;
    }

    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getSalas() {
        return salas;
    }

    public void setSalas(int salas) {
        this.salas = salas;
    }

    public Boolean getTemGaragem() {
        return temGaragem;
    }

    public void setTemGaragem(Boolean temGaragem) {
        this.temGaragem = temGaragem;
    }

    public Boolean getTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(Boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public Boolean getTemJardim() {
        return temJardim;
    }

    public void setTemJardim(Boolean temJardim) {
        this.temJardim = temJardim;
    }
}
