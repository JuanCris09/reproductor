package com.cursoalura.reproductor;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeRepoducciones;
    private int meGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeRepoducciones() {
        return totalDeRepoducciones;
    }

    public void setTotalDeRepoducciones(int totalDeRepoducciones) {
        this.totalDeRepoducciones = totalDeRepoducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
