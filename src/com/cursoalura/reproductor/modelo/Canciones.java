package com.cursoalura.reproductor;

public class Canciones extends Audio {
    private String cantante;
    private int tiempo;
    private int totalDeEscuchados;

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTotalDeEscuchados() {
        return totalDeEscuchados;
    }

    public void setTotalDeEscuchados(int totalDeEscuchados) {
        this.totalDeEscuchados = totalDeEscuchados;
    }
}
