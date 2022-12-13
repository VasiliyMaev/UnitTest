import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    @Test
    public void testConstructor() {
        ClassMap classMap = new ClassMap("Hello!");
        Assertions.assertNotNull(classMap);
    }

    @Test
    public void testMap() {
        String result = ClassMap.maxAndMinValue("Text Text ttt a");
        Assertions.assertEquals("Чаще всего встречается: t=7\n" +
                "Реже всего встречается: a=1", result);
    }

    @Test
    public void testMaxValue() {
        Map map = new HashMap();
        map.put("f", 3);
        map.put("a", 1);
        String result = ClassMap.maxResult(map, -1);
        Assertions.assertEquals("Чаще всего встречается: f=3", result);
    }

    @Test
    public void testMinValue() {
        Map map = new HashMap();
        map.put("f", 3);
        map.put("a", 1);
        String result = ClassMap.minResult(map, -1);
        Assertions.assertEquals("Чаще всего встречается: a=1", result);
    }

}
