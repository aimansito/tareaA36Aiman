/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String urlBase = "https://v2.jokeapi.dev/joke/Any";
        String urlBase2 = "https://v2.jokeapi.dev/joke/Any?lang=es&amount=10";
        String fichero2 = ConexionHTTP.peticionHttpGet(urlBase2);
         
//        Joke chiste = (Joke) JsonService.stringToPojo(fichero, Joke.class); 
//        System.out.println(chiste);
        ListaChistes lista = (ListaChistes) JsonService.stringToPojo(fichero2, ListaChistes.class);
        lista.getJokes().forEach(System.out::println);
    }
}
