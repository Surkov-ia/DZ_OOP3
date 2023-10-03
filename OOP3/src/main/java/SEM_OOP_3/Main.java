package SEM_OOP_3;

import java.util.ArrayList;
import java.util.List;

/**
 * - Создать класс Студент
 * - Создать класс УчебнаяГруппаИтератор
 * - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
 * - Реализовать его контракты (включая удаление)
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Vasya",20,4);
        Student s2 = new Student("Luda",30,6);
        Student s3 = new Student("Kuza",40,2);
        Student s4 = new Student("Goro",50,1);

        List<Student> studentsList = new ArrayList<>(List.of(s1,s2,s3,s4));
        StudyGroupIterator studyGroupIterator = new StudyGroupIterator(studentsList);
        System.out.println(studyGroupIterator.toString());

        studyGroupIterator.setCurrentIndex(studyGroupIterator.searchStudent("Vasya",20,4));
        studyGroupIterator.remove();
        studyGroupIterator.reset();


        System.out.println("==".repeat(30));
        studyGroupIterator.iterator();

        while (studyGroupIterator.hasNext()){
            System.out.println(studyGroupIterator.getStudents(studyGroupIterator.getCurrentIndex()));
            studyGroupIterator.next();
        }
        System.out.println("==".repeat(30));
        System.out.println(studyGroupIterator);

    }
}
