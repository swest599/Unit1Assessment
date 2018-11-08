import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimitiveTest {
    private PrimitiveConverter primitiveConverter;
    @Before
    public void setUp() throws Exception {
        primitiveConverter = new PrimitiveConverter();
    }

    @Test
    public void test_integer() {
        Integer i = primitiveConverter.intToInteger(42);
        Assert.assertTrue(i != null && i == 42);
    }

    @Test
    public void test_double() {
        Double d = primitiveConverter.doubleToDouble(3.14);
        Assert.assertTrue(d != null && d == 3.14);
    }

    @Test
    public void test_character() {
        Character c = primitiveConverter.charToCharacter('A');
        Assert.assertTrue(c != null && c == 'A');
    }

    @Test
    public void test_boolean() {
        Boolean b = primitiveConverter.booleanToBoolean(false);
        Assert.assertTrue(b != null && b == false);
    }
}
