package day9.question3;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
public class Maps {
    public static void main(String[] args) {

    }
    public static int count(Map<Integer,Integer> map){
        return map.size();
    }
    public static void empty(Map<Integer,Integer> map){
        map.clear();
    }
    public static boolean contains(Map<Integer,Integer> map, int key){
        return map.containsKey(key);
    }
    public static boolean containsKeyValue(Map<Integer,Integer> map, int key, int value){
        return map.containsKey(key) && map.containsValue(value);
    }
    public static Set<Integer> keySet(Map<Integer,Integer> map){
        return map.keySet();
    }
    public static Collection<Integer> values(Map<Integer,Integer> map){
        return map.values();
    }
    public static String getColor(int value){
        Map<Integer,String> map = Map.of(
                1,"black",
                2,"red",
                3,"white"
        );
        return map.get(value);
    }
}
