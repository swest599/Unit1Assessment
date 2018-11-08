import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FourWindsTest {
    public static int sNorth;
    public static int sSouth;
    public static int sEast;
    public static int sWest;


    @Before
    public void setUp() throws Exception {
        sNorth = FourWinds.NORTH;
        sSouth = FourWinds.SOUTH;
        sEast = FourWinds.EAST;
        sWest = FourWinds.WEST;
    }

    @Test
    public void test_north() {
        Assert.assertEquals(sNorth, FourWinds.getNorth(), 0);
    }

    @Test
    public void test_south() {
        Assert.assertEquals(sSouth, FourWinds.getSouth(), 0);
    }

    @Test
    public void test_east() {
        Assert.assertEquals(sEast, FourWinds.getEast(), 0);
    }

    @Test
    public void test_west() {
        Assert.assertEquals(sWest, FourWinds.getWest(), 0);
    }

}
