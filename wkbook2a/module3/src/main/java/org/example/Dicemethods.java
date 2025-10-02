package org.example;
import java.util.Random;

public class Dicemethods {
    private Random random = new Random();

    public int roll(){
        return random.nextInt(6)  +1;
    }

}
