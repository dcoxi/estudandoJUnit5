package main.java;
import java.util.Collections;
import  java.util.List;
import java.util.ArrayList;


public class Application {

    public static void main(String[] args){

        List<String> listString = new ArrayList<>();
        listString.add("1");
        listString.add("2");
        listString.add("3");
        listString.add("4");
        listString.add("5");

        Collections.sort(listString, Collections.reverseOrder());

       System.out.println("Estrutura projecto");
    }

}
