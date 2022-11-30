package anotation.testInstance.per_method;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class LifeCycleDemo {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Executando o  @BeforeAll");
    }

    LifeCycleDemo(){
        System.out.println("Executando o constructor");
    }

    @BeforeEach
     void beforeEach(){
        System.out.println("Executando o  @BeforeEach");
    }

    @Test
    public void testOne(){
        System.out.println("Executando o teste 1");
    }

    @Test
    public void testTwo(){
        System.out.println("Executando o teste 2");
    }

    @AfterEach
     void afterEach(){
        System.out.println("Executando o  @AfterEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Executando o  @AfterAll");
    }

}
