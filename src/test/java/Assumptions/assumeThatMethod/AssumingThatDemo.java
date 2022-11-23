package Assumptions.assumeThatMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class AssumingThatDemo {

    @Test
     void assumingThatWithNoMessage(){
         assumingThat("Non".equals(System.getProperty("user.name")) == true, () -> {
             System.out.println("user.name: Dilangue");
             assertEquals(5,3+2);
         });

         System.out.println("Passou..");
         assertEquals(3,2+1);
     }

    @Test
     void assumingThatWithMessage(){
         assumingThat(()-> "dilangue.coxi".equals(System.getProperty("user.name")),
         () -> {
             System.out.println("user.name: Dilangue");
             assertEquals(5,3+2,"Válido");
         });

         System.out.println("Passou..");
         assertEquals(3,2+1);
     }
}
