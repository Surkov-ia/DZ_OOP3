package DZ_OOP_3;

/**
 * — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
 * — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
 * — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
 * — Модифицировать класс Контроллер, добавив в него созданный сервис;
 * — Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flow stream = new Flow(1);

        StreamComparator group1 = new StreamComparator("№1", 25);
        StreamComparator group2 = new StreamComparator("№2", 20);
        StreamComparator group3 = new StreamComparator("№3", 30);
        StreamComparator group4 = new StreamComparator("№4", 15);
        StreamComparator group5 = new StreamComparator("№5", 10);
        StreamComparator group6 = new StreamComparator("№6", 40);

        System.out.println("==".repeat(13)+"GROUP"+"==".repeat(13));

        List<StreamComparator> groupList = new ArrayList<>(List.of(group1,group2,group3,group4,group5,group6));
        StudentGroupIterator studentGroupIterator = new StudentGroupIterator(groupList);
        System.out.println(studentGroupIterator.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",",""));

        System.out.println("==".repeat(8)+"Поочередный вывод груп"+"==".repeat(8));

        while (studentGroupIterator.hasNext()){
            System.out.println(studentGroupIterator.getGroup(studentGroupIterator.getCount()).toString1());
            studentGroupIterator.next();
        }

        System.out.println("==".repeat(5)+"Сортировка груп по количеству студентов"+"==".repeat(5));

        Collections.sort(groupList);
        System.out.println((groupList.toString())
                .replace("[", "")
                .replace("]", "")
                .replace(",",""));


//        stream.addGroup(group1);
//        stream.addGroup(group2);
//        stream.addGroup(group3);
//        stream.addGroup(group4);
//        stream.addGroup(group5);
//        stream.addGroup(group6);

//        for (StreamComparator group : stream) {
//            System.out.println(group);
//
//        }
//        System.out.println("==".repeat(30));
//        Collections.sort(stream.getGroups());
//
//        for (StreamComparator group : stream) {
//            System.out.println(group);
//
//        }
//        System.out.println("==".repeat(30));
    }

}
