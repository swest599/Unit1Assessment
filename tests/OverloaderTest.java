import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OverloaderTest {
    private Overloader overloader;
    private double d;

    @Before
    public void setUp() throws Exception {
        overloader = new Overloader();
    }

    @Test
    public void test_int_int() {
        d = overloader.doubleDivision(5, 2);
        Assert.assertEquals( d, 2.5, 0);
    }

    @Test
    public void test_int_double() {
        d = overloader.doubleDivision(5, 2.0);
        Assert.assertEquals( d, 2.5, 0);
    }

    @Test
    public void test_double_int() {
        d = overloader.doubleDivision(5.0, 2);
        Assert.assertEquals( d, 2.5, 0);
    }

    @Test
    public void test_double_double() {
        d = overloader.doubleDivision(5.0, 2.0);
        Assert.assertEquals( d, 2.5, 0);
    }
}
