package JavaMain.HW_10_03_23;

import java.util.*;

public class IntegerListDemo_3 {
    public static void main(String[] args) {
        List<Integer> newlist = new ArrayList<>();
        int listSize = 11000000;
        List<Integer> list =  fillNewList(newlist,listSize);
        System.out.println(list);
        System.out.println("время перебора for-each loop __" + getTimeForEachLoop(list) + " ms");
        System.out.println("время перебора classic for + вызываем list.size() __" + getTimeForClassicFor(list) + " ms");
        System.out.println("время перебора classic for + записываем list.size() в переменную __" + getTimeForClassicForSize(list) + " ms");
        System.out.println("время перебора classic for + записываем list.size() в переменную __ но с конца! " + getReversTimeForClassicForSize(list) + " ms");
        System.out.println("время Iteratorom + записываем list.size() в переменную __ " + getTimeForIterator(list) + " ms");
        System.out.println("время Iteratorom + записываем list.size() в переменную __ " + getTimeForListIterator (list) + " ms");

    }
    public static List<Integer> fillNewList (List<Integer> newlist, int listSize){
        int temp;
        Random random = new Random();
        for (int i=0; i < listSize; i++) {
            temp = random.nextInt(100);
            newlist.add(temp);
        }
        return newlist;
    }
    // перебрать for-each loop
    public static int getTimeForEachLoop (List<Integer> list){
        long start = System.currentTimeMillis();
        for (Integer element : list) {
            // перебор
        }
        long finish = System.currentTimeMillis();
        return (int) (finish - start);
    }
    //classic for и вызываем list.size() для каждой итерации
    public static int getTimeForClassicFor (List<Integer> list ){
        long start = System.currentTimeMillis();
        for (int i=0; i < list.size(); i++) {
            list.size();
        }
        long finish = System.currentTimeMillis();
        return (int) (finish - start);
    }
    // classic for, но list.size() определяем в переменную
    public static int getTimeForClassicForSize (List<Integer> list ){
        long start = System.currentTimeMillis();
        for (int i=0; i < list.size(); i++) {
            int temp = list.size();
        }
        long finish = System.currentTimeMillis();
        return (int) (finish - start);
    }
    // classic for, list.size() определяем в переменную, перебираем с конца (i--)
    public static int getReversTimeForClassicForSize (List<Integer> list ){
        long start = System.currentTimeMillis();
        for (int i=list.size() -1; i > 0; i--) {
            int temp = list.size();
        }
        long finish = System.currentTimeMillis();
        return (int) (finish - start);
    }
    // используя Itertor
    public static int getTimeForIterator (List<Integer> list ){
        long start = System.currentTimeMillis();
        Iterator<Integer> iterator =list.iterator();
        while (iterator.hasNext()){
            int temp = iterator.next();
        }
        long finish = System.currentTimeMillis();
        return (int) (finish - start);
    }
    //используя ListIterator
    public static int getTimeForListIterator (List<Integer> list ){
        long start = System.currentTimeMillis();
        ListIterator<Integer> listIterator =list.listIterator();
        while (listIterator.hasNext()){
            int temp = listIterator.next();
        }
        long finish = System.currentTimeMillis();
        return (int) (finish - start);
    }
}
/*
создать List наполнить его 10М> элементами


При наполнении списка  сохраняем i- тый элемент в переменную temp


перебрать for-each loop


classic for и вызываем list.size() для каждой итерации


classic for, но list.size() определяем в переменную


classic for, list.size() определяем в переменную, перебираем с конца (i--)


используя Itertor
используя ListIterator


для всех случаев сделать замер времени
результат вывести в консоль
 */