import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParentChildTest {
    Parent parent;
    Parent child01;
    Child child02;

    @Before
    public void setUp() throws Exception {
        parent = new Parent("blue", "blonde");
        child01 = new Child("green", "red", 30);
        child02 = new Child("brown", "grey", 70);
    }

    @Test
    public void test_parent_get_eye_color() {
        Assert.assertEquals("blue", parent.getEyeColor());
    }

    @Test
    public void test_parent_get_hair_color() {
        Assert.assertEquals("blonde", parent.getHairColor());
    }

    @Test
    public void test_child_get_eye_color() {
        Assert.assertEquals("green", child01.getEyeColor());
    }

    @Test
    public void test_child_get_hair_color() {
        Assert.assertEquals("red", child01.getHairColor());
    }

    @Test
    public void test_child_get_age() {
        Assert.assertEquals(70, child02.getAge());
    }


}
