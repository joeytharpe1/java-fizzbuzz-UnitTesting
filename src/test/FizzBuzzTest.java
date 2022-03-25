import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


class FizzBuzzTest {
    FizzBuzz fizzy; //creating instance field of class

    @BeforeEach //create a new instance before every test
    void setUp() {
        System.out.println("testing before each..");
        fizzy = new FizzBuzz();//creating new object of FizzBuzz class before each test
    }

    @Test
    void getNum() {
        int num = 15; //example input from scanner
        InputStream in = new ByteArrayInputStream(String.valueOf(num).getBytes()); //convert to string
        System.setIn(in);

        assertEquals("FizzBuzz", fizzy.getNum(), "not multiple of 15");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each..");
    }
}