package JavaMain.HW_10_03_23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntegerListDemo_2 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 13, 23,31,54));
        List<Integer> myLinkkedList = new LinkedList<>();
        System.out.println("исходный ArrayList " + myList);
        myLinkkedList.addAll(myList);
        System.out.println("дублированный LinkedList" + myLinkkedList);
        myLinkkedList.add(1111);
        System.out.println("исходник не изменился" + myList);
        myLinkkedList = myList;
        myLinkkedList.add(1111);
        System.out.println("после приравнивания ссылок меняется и исходный список" + myList);

        // возможно вопрос о содержании одинаковых элементов в одном листе

        List<Integer> myList2 = new ArrayList<>(List.of(1, 2, 3, 1, 2,3,3));
        List<Integer> myLinkkedList2 = new LinkedList<>(List.of(1, 2, 3, 1, 2,3,3));
        System.out.println("ArrayList с одинаковыми элементами " + myList2);
        System.out.println("LinkedList с одинаковыми элементами  " + myLinkkedList2);

    }
}
/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.
 */