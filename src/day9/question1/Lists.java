package day9.question1;
import java.util.*;
public class Lists {
    public static void main(String[] args) {

    }
    public static void insertFirst(List<Integer> list, int value){
        list.add(0,value);
    }
    public static void insertLast(List<Integer> list, int value){
        list.add(value);
    }
    public static void replace(List<Integer> list, int value){
        list.set(2,value);
    }
    public static void removeThird(List<Integer> list){
        list.remove(2);
    }
    //Function to remove the element ”666” from a list
    public static void removeEvil(List<Integer> list){
        list.remove(Integer.valueOf(666));
    }
    public static List<Integer> generateSquare(){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            list.add(i*i);
        }
        return list;
    }
    public static boolean contains(List<Integer> list, int value){
        return list.contains(value);
    }
    public static void copy(List<Integer> source, List<Integer> target){
        target.addAll(source);
    }
    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }
    public static void reverseManual(List<Integer> list){
        List<Integer> temp = new ArrayList<>();
        for(int i = list.size()-1; i >= 0; i--){
            temp.add(list.get(i));
        }
        list.clear();
        list.addAll(temp);
    }
    public static void insertBeginningEnd(LinkedList<Integer> list,int value){
        list.addFirst(value);
        list.addLast(value);
    }
}
