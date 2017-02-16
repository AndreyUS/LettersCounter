import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LettersCounterTest {


    @Test
    public void countTest1() throws Exception {
        assertEquals("a5d4e1g2s3", LettersCounter.create("adasdasadasdgeg").count());
    }

    @Test
    public void countTest2() throws Exception {
        assertEquals("a5z5", LettersCounter.create("azazazazaz").count());
    }

    @Test
    public void countTest3() throws Exception {
        assertEquals("A1a1", LettersCounter.create("Aa").count());
    }

    @Test
    public void countTest4() throws Exception {
        assertEquals("", LettersCounter.create("").count());
    }

    @Test(expected = IllegalArgumentException.class)
    public void countWithNull() throws Exception {
        LettersCounter.create(null).count();
    }

}