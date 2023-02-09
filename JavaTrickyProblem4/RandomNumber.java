package JavaTrickyProblem4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {
        //Generate random number in java
        Random random = new Random();
        for (int i=0;i<=5;i++)
        {
            System.out.println("Random int " + random.nextInt(20));
        }
        //2nd type
        System.out.println((int)(Math.random() * 20));
        //3rd type
        System.out.println(ThreadLocalRandom.current().nextInt(1,20));
    }
}
