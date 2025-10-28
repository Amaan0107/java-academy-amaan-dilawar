package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Chemist chemist = new Walter();
    Chemist chemist2 = new Jesse();
    Chemist chemist3 = new Chemist();

    ArrayList<Chemist> team = new ArrayList<>();
    chemist.cook();
    chemist2.cook();
    chemist3.cook();
        for (Chemist c : team) {
            c.cook();
        }
}
}