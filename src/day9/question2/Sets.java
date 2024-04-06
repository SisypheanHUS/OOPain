package day9.question2;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

    }
    public static Set<Integer> intersectionManual(Set<Integer> fisrt, Set<Integer> second){
        Set<Integer> result = new HashSet<>();
        for(Integer i : fisrt){
            if(second.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static Set<Integer> unionManual(Set<Integer> fisrt, Set<Integer> second){
        Set<Integer> result = new HashSet<>();
        result.addAll(fisrt);
        result.addAll(second);
        return result;
    }
    public static Set<Integer> intersection(Set<Integer> fisrt, Set<Integer> second){
        Set<Integer> result = new HashSet<>(fisrt);
        result.retainAll(second);
        return result;
    }
    public static Set<Integer> union(Set<Integer> fisrt, Set<Integer> second){
        Set<Integer> result = new HashSet<>(fisrt);
        result.addAll(second);
        return result;
    }
    public static List<Integer> toList(Set<Integer> source){
        List<Integer> result = new ArrayList<>();
        result.addAll(source);
        return result;
    }
    public static List<Integer> removeDuplicates(List<Integer> source){
        Set<Integer> set = new HashSet<>(source);
        List<Integer> result = new ArrayList<>();
        result.addAll(set);
        return result;
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source){
        List<Integer> result = new ArrayList<>();
        for(Integer i : source){
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static String firstRecurringCharacter(String s){
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                return String.valueOf(c);
            }
            set.add(c);
        }
        return null;
    }
    public static Set<Character> allRecurringChars(String s){
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                result.add(c);
            }
            set.add(c);
        }
        return result;
    }
    public static Integer[] toArray(Set<Integer> source){
        return source.toArray(new Integer[0]);
    }
    public static int getFirst(TreeSet<Integer> source){
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source){
        return source.last();
    }
    public static int getGreater(TreeSet<Integer> source, int value){
        return source.higher(value);
    }
}
