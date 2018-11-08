import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DataStructuresTest {
    DataStructures dataStructures;

    @Before
    public void setUp() throws Exception {
        dataStructures = new DataStructures() {
            @Override
            public char[] stringToCharArray(String word) {
                return new char[0];
            }

            @Override
            public ArrayList<Integer> multiplicationTableList(int number) {
                return new ArrayList<Integer>();
            }

            @Override
            public HashMap<String, Integer> wordLength(String[] wordArray) {
                return new HashMap<String, Integer>();
            }

            @Override
            public HashSet<Character> uniqueCharacters(String word) {
                return new HashSet<Character>();
            }
        };
    }

    @Test
    public void test_string_to_char_array() {
        Assert.assertTrue(dataStructures.stringToCharArray("hello") instanceof char[]);
    }

    @Test
    public void test_multiplication_table_List() {
        Assert.assertTrue(dataStructures.multiplicationTableList(5) instanceof ArrayList);
    }

    @Test
    public void test_word_length() {
        Assert.assertTrue(dataStructures.wordLength(new String[5]) instanceof HashMap);
    }

    @Test
    public void test_unique_characters() {
        Assert.assertTrue(dataStructures.uniqueCharacters("hello") instanceof HashSet);
    }
}
