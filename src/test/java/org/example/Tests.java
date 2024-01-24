package org.example;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    // många tester som är små och specifika istället för ett enda stort test (förslag)
    @Test
    public void TestingMain(){
        Main main1 = new Main();
        Main main2 = new Main();

        assertEquals(main1.add(), main2.add());
    }

    @Test
    public void TestingAdd(){
        Main main= new Main();

        assertEquals(main.add(), 10);
    }
}
