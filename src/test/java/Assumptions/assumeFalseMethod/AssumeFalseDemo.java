package Assumptions.assumeFalseMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class AssumeFalseDemo {

    @Test
    void assumeFalseWithNoMessage(){
        System.out.println(System.getProperties());
        assumeFalse((System.getProperty("user.name")).equalsIgnoreCase("dilangue.coxi"));
        System.out.println("Assumption True");
        assertEquals(3, 2+1);
    }

    @Test
    void assumeFalseWithMessage(){
        String envroiment = System.getProperty("DEV");
        assumeFalse((System.getProperty("ENV")).equalsIgnoreCase("DEV"),
                "Presução errada!");
        System.out.println("Assumption True");
        assertEquals(3, 2+1);
    }
}
