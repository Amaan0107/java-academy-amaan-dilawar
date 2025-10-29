package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Pokemon> pokemons = new ArrayList<Pokemon>();
        pokemons.add(new Pikachu("Pikachu"));
        pokemons.add(new Gengar("Gengar"));

        for( int i = 0; i < pokemons.size(); i++ ) {
            pokemons.get(i).attack();
        }

    }
}