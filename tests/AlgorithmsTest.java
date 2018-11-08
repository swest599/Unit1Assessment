import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AlgorithmsTest {
    DataStructures algorithms;

    @Before
    public void setUp() throws Exception {
        algorithms = new Algorithms();
    }

    @Test
    public void test_string_to_char_array() {
        String input = "hello";
        char[] array = algorithms.stringToCharArray(input);
        for (int i = 0; i < input.length(); i++) {
            Assert.assertArrayEquals(array, new char[]{'h', 'e', 'l', 'l', 'o'});
        }
    }

    @Test
    public void test_multiplication_table_List() {
        Integer[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        ArrayList<Integer> list = algorithms.multiplicationTableList(5);
        for (int i = 0; i < 10; i++) {
            Assert.assertEquals(array[i], list.get(i), 0);
        }
    }

    @Test
    public void test_word_length() {
        String[] array = {"apple", "orange", "canepa", "grapefruit", "pear"};
        HashMap<String, Integer> lengthMap = algorithms.wordLength(array);
        for (String s : array) {
            Assert.assertEquals(s.length(), Integer.parseInt(lengthMap.get(s).toString()), 0);
        }
    }

    @Test
    public void test_unique_characters() {
        HashSet<Character> set = algorithms.uniqueCharacters("mississippi");
        Assert.assertEquals(set.size(), 4, 0);
    }
}
