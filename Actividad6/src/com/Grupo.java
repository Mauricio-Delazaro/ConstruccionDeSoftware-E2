package com;

import java.util.ArrayList;

public class Grupo {
    

    private Profesor profesor;
    private ArrayList<Alumno> listaAlumnos;

    public Grupo (Profesor profesor){
            this.profesor = profesor;
            listaAlumnos = new ArrayList<>();
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void agregarAlumnos(Alumno alumno){
        this.listaAlumnos.add(alumno);
    }

    public void mostrarInformacionAlumnos(){
        System.out.println("Lista de alumnos");
        for (Alumno alumno:listaAlumnos){
            System.out.println(alumno);
        }
    }

    public void mostrarInformacionProfesor(){
        System.out.println(profesor);
    }



}