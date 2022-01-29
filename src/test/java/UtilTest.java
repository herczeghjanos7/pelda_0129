import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilTest {

    @Test
    public void shouldReturnMinusOneWhenEmptyArray() {
        int result = Utils.maxker(new int[]{});
        assertEquals(-1, result);
    }

    @Test
    public void shouldReturnMinusOne() {
        int result = Utils.maxker(null);
        assertEquals(-1, result);
    }

    @Test
    public void shouldReturnCorrectIndexOnIntegerMINVALUE() {
        int result = Utils.maxker(new int[]{Integer.MIN_VALUE});
        assertEquals(-1, result);
    }
}
