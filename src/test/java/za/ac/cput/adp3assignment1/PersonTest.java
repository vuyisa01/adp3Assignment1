package za.ac.cput.adp3assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Legiste Ndabashinze - 217046207
 */

class PersonTest {

    private Person p1;
    private Person p2;
    private Person p3;

    @BeforeEach
    void setUp() {
        p1 = new Person();
        p2 = new Person("Legiste", "Ndabashinze", 21, "Male");
        p3 = p1;

    }

    @Test
    void testObejectEquality() {
        assertEquals(p1, p3);
        //assertNotEquals(p1,p2);
    }

    @Test
    void testOjectIdentity() {
        assertSame(p1, p3);
        //assertNotSame(p1,p2);
    }

    @Test
    void testFailingTest() {
        assertNotSame(p1, p2);
        fail("this test has successfully FAILED!");
    }

    @Test
    @Timeout(1)  // any number below 1 will result the test to fail.
    void testTimeoutsTest(){
        System.out.println(p2.toString());
    }

    @Test
    @Disabled
    void testDisablingTest() {
        String string = "This test is to be Ignored";
        System.out.println(string);
    }

}