package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Gato> g = new ArrayList<>();
        List<Gato> g2 = new ArrayList<>();

        try {
            g.add(new Gato("pppp",22));
            g.add(new Gato("ppp2",222));
            g.add(new Gato("ppp3",22222));
            Gato.save(g,"/home/jcerveram/IdeaProjects/Expecion/src/main/java/org/example/prueba.txt");
            g=Gato.load("/home/jcerveram/IdeaProjects/Expecion/src/main/java/org/example/prueba.txt");
            System.out.println(g);
        }catch (Exception e){

            e.printStackTrace();

        }

    }
}