package JavaMain.HW_10_03_23;

import java.util.*;

public class IntegerListDemo {
    public static void main(String[] args) {

     List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 13, 23,31,54));


     boolean addInHead = false; // false - добавляет новый элемент в конец списка
     int newElement = 11111;
     int indexToDelit = 2;
     int elementToDelit = 11111;

     List<Integer> newLinkkedList = new LinkedList<>();
     int listSize = 21;
 /*
 В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:

добавить в список элемент (в начало и в конец)

узнать длину списка

удалить элемент из списка (по индексу и без)

узнать пустой список или нет

обойти список и вывести на консоль каждый элемент.
 */
        System.out.println(myList);
        System.out.println(addElement(myList,addInHead,newElement)); // добавление элемента
        System.out.println("длинна списка  " +  myList.size());
        isListEmpty(myList); // проверка на пустоту
        System.out.println("выводим на консоль каждый элемент");
        printElements(myList);
        System.out.println(deliteIndex(myList,indexToDelit));  // удаление по индексу
        System.out.println(deliteElement(myList,elementToDelit)); // удаление по совпадению


        

    }
    public static List<Integer> addElement (List<Integer> myList, boolean addInHead, int newElement){
        if (addInHead){
            myList.add(0,newElement);
        } else {
            myList.add(newElement);
        }
        return myList;
    }
    public static void isListEmpty (List<Integer> myList){
        if (myList.isEmpty()) {
            System.out.println("Список пустой");
        } else {
            System.out.println("Список не пустой");
        }
    }
    public static void printElements (List<Integer> myList) {
        for (int i=0; i < myList.size() ; i++) {
            System.out.println(myList.get(i));

        }
    }
    public static List<Integer>   deliteIndex (List<Integer> myList, int indexToDelit) {
        myList.remove(indexToDelit);
        return myList;
    }
    public static List<Integer>   deliteElement (List<Integer> myList, int elementToDelit) {
        Iterator<Integer> iter = myList.iterator();
        int var;
        while (iter.hasNext()){
            var = iter.next();
            if (var == elementToDelit){
                iter.remove();
            }
        }
        return myList;
    }
    public static List<Integer> fillNewList (List<Integer> newLinkkedList, int listSize){
        int temp;
        Random random = new Random();
        for (int i=0; i < listSize; i++) {
            temp = random.nextInt(100);
            newLinkkedList.add(temp);

        }

        return newLinkkedList;
    }

}
