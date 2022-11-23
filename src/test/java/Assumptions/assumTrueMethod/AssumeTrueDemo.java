package Assumptions.assumTrueMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class AssumeTrueDemo {

    @Test
    void assumeTrueWithNoMessage(){
        System.out.println(System.getProperties());
        assumeTrue((System.getProperty("user.name")).equalsIgnoreCase("dilangue.coxi"));
        System.out.println("Assumption True");
        assertEquals(3, 2+1);
    }

    @Test
    void assumeTrueWithMessage(){
        String envroiment = System.getProperty("DEV");
        assumeTrue((System.getProperty("ENV")).equalsIgnoreCase("DEV"),
                "Presução errada!");
        System.out.println("Assumption True");
        assertEquals(3, 2+1);
    }

}
