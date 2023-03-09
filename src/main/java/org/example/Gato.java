package org.example;

import org.example.GatoException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Gato implements Serializable {
    private String nombre;
    private int edad;

    private static  String dataFile;

    public Gato(String nombre, int edad)  throws GatoException {
        if(nombre.length()<3)
            throw new GatoException("Nombre de gato incorrecto");
        if(edad<0)
            throw new GatoException("Edad del gato incorrecta");
        this.nombre = nombre;
        this.edad = edad;
    }

    public static  void save(List<Gato> gatos, String fileName)throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)))){
            for (int i = 0; i < gatos.size(); i++) {
                out.writeObject(gatos.get(i));
//                out.writeObject(gatos.get(i).getNombre());
//                out.writeObject(gatos.get(i).getEdad());
            }
        }
    }

    public static List<Gato> load(String nameFile) throws  IOException,ClassNotFoundException{
        List<Gato> g = new ArrayList<>();


        try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nameFile)
        ))) {
            Gato gato;
            while (true) {
                gato = (Gato) in.readObject();
                g.add(gato);
            }
        }catch (EOFException e){

        }
        return g;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws GatoException {
        if(nombre.length()<3)
            throw new GatoException("Nombre de gato incorrecto");
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws GatoException {
        this.edad = edad;
        if(edad<0)
            throw new GatoException("Edad del gato incorrecta");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}