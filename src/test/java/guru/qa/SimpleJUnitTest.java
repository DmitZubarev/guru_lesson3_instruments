package guru.qa;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    // вывод в самом начале всего
    @BeforeAll
    static void beforeAll() {
        System.out.println("\n### @beforeAll\n");
    }

    // вывод в самом конце всего
    @AfterAll
    static void afterAll() {
        System.out.println("\n### @afterAll\n");
    }

    // вывод перед каждым тестом
    @BeforeEach
    void beforeEach() {
        System.out.println("###     @beforeEach");
    }

    // вывод после каждого теста
    @AfterEach
    void afterEach() {
        System.out.println("###     @afterEach\n");
    }

    // Тупая проверка
    @Test
    void firstTest() {
        // msg = "Первый тест";
        System.out.println("###         @firstTest");
        Assertions.assertTrue(3>2);
    }

    @Test
    void secondTest() {
        // msg = "Второй тест";
        System.out.println("###         @secondTest");
        Assertions.assertTrue(2 * 2 == 4);
    }

    @Test
    void thirdTest() {
        // msg = "Третий тест";
        System.out.println("###         @thirdTest");
        Assertions.assertFalse(2 + 2 == 5);
    }

}