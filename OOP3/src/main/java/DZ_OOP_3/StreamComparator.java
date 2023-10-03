package DZ_OOP_3;

import java.util.Iterator;

public class StreamComparator implements Comparable<StreamComparator> {
    private String nameGroup;
    private int studentNum;


    public StreamComparator(String nameGroup, int studentNum) {
        this.nameGroup = nameGroup;
        this.studentNum = studentNum;
    }

    @Override
    public int compareTo(StreamComparator otherGroup) {
        return Integer.compare(this.studentNum, otherGroup.studentNum);
    }

    @Override
    public String toString() {
        return "StudentGroup: " +
                "Название группы " + nameGroup + ' ' +
                "Количество студентов " + studentNum +
                '\n';
    }

    public String toString1() {
        return "StudentGroup: " +
                "Название группы " + nameGroup + ' ' +
                "Количество студентов " + studentNum +
                ' ';
    }
}
