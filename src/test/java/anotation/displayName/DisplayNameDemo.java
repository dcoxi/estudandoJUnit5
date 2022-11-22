package anotation.displayName;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Display Name Demo")
class DisplayNameDemo {


    @Test
    @DisplayName("Display Name Demo Test")
    void displayNameDemoTest(){
        assertEquals(3,2+1, "Os valores são diferentes");
    }

}
