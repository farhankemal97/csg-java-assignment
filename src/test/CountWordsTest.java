import com.csg.CountWords;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CountWordsTest {

    @Test
    void TestCountWordsStartingWithM_EmptyList() {
        List<String> words = new ArrayList<>();
        int count = CountWords.countWordsStartsWithCharacterM(words);
        assertEquals(0, count);
    }

    @Test
    void TestCountWordsStartingWithM_ListWithStringStartingWithM() {
        List<String> words = new ArrayList<>();
        words.add("Mango");
        words.add("mandarin");
        words.add("lychee");
        words.add("mammoth");

        int count = CountWords.countWordsStartsWithCharacterM(words);
        assertEquals(3, count);
    }

    @Test
    void TestCountWordsStartingWithM_ListWithoutStringStartingWithM() {
        List<String> words = new ArrayList<>();
        words.add("Pango");
        words.add("remote");
        words.add("lychee");
        words.add("Bird");

        int count = CountWords.countWordsStartsWithCharacterM(words);
        assertEquals(0, count);
    }

    @Test
    void TestCountWordsLongerThan5_EmptyList() {
        List<String> words = new ArrayList<>();
        List<String> result = CountWords.countWordsLongerThan5Characters(words);
        assertEquals(0, result.size());
    }


    @Test
    void TestCountWordsLongerThan5() {
        List<String> words = new ArrayList<>();
        words.add("Crocodile");
        words.add("Panda");
        words.add("Ant");
        words.add("Bird");
        words.add("Bird");
        words.add("Butterfly");
        List<String> result = CountWords.countWordsLongerThan5Characters(words);
        assertEquals(2, result.size());
        assertEquals("Crocodile", result.get(0));
        assertEquals("Butterfly", result.get(1));
    }


    @Test
    void TestCountWordsLongerThan5_NoLongWord() {
        List<String> words = new ArrayList<>();
        words.add("Panda");
        words.add("Ant");
        words.add("Bird");
        words.add("Bird");
        List<String> result = CountWords.countWordsLongerThan5Characters(words);
        assertEquals(0, result.size());
    }
}
