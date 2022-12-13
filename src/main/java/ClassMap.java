import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ClassMap {
    String text;
    public ClassMap(String text) {
        this.text = text;
    }
    public static String maxAndMinValue(String text){
        char[] characterArray = text.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "").toCharArray();

        java.util.Map<Character, Integer> mapChar = new HashMap<>();

        for (Character map : characterArray) {
            if (mapChar.containsKey(map)) {
                int value = mapChar.get(map);
                mapChar.put(map, value + 1);
            } else {
                int count = 1;
                mapChar.put(map, count);
            }
        }

        return maxResult(mapChar, -1) + "\n" + minResult(mapChar, Integer.MAX_VALUE);

    }
    public static String maxResult(Map<Character, Integer> mapChar, int maxValue){
        java.util.Map.Entry<Character, Integer> maxResult = null;
        for (java.util.Map.Entry<Character, Integer> max : mapChar.entrySet()) {

            if (max.getValue() > maxValue) {
                maxResult = max;
                maxValue = max.getValue();
            }
        }
        return  "Чаще всего встречается: " + maxResult;
    }
    public static String minResult(Map<Character, Integer> mapChar, int minValue) {
        java.util.Map.Entry<Character, Integer> minResult = null;
        for (java.util.Map.Entry<Character, Integer> min : mapChar.entrySet()) {
            if (min.getValue() < minValue) {
                minResult = min;
                minValue = min.getValue();
            }
        }
        return "Реже всего встречается: " + minResult;
    }
}
