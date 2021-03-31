package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilisTest {

    private MathUtilis mathUtilis1;
    private MathUtilis mathUtilis2;
    private MathUtilis mathUtilis3;

    @BeforeEach
    void setUp(){
        mathUtilis1 = new MathUtilis();
        mathUtilis2 = new MathUtilis();
        mathUtilis3 = mathUtilis1;
    }

    @Test
    void testIdentity(){
        assertSame(mathUtilis1, mathUtilis1);
    }

    @Test
    void testEquality(){
        assertEquals(mathUtilis1, mathUtilis3);
    }

}