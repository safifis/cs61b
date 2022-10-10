package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes1() {
        IntList lst = IntList.of(19, 20, 21, 22, 23);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("361 -> 20 -> 21 -> 22 -> 529", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes2() {
        IntList lst = IntList.of(25, 26, 27, 28, 29);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("25 -> 26 -> 27 -> 28 -> 841", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes3() {
        IntList lst = IntList.of(25, 26, 27, 28);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("25 -> 26 -> 27 -> 28", lst.toString());
        assertFalse(changed);
    }
}
