package DZ_OOP_3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StreamComparator> {
    private List<StreamComparator> groupList;
    private List<Student> students = new ArrayList<>();
    private int count;


    public StudentGroupIterator(List<StreamComparator> groupList) {
        this.groupList = groupList;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count<groupList.size();
    }

    @Override
    public StreamComparator next() {
        if(!hasNext())
        {
            return null;
        }
        return groupList.get(count++);
    }

    public StreamComparator getGroup(int count) {
        return groupList.get(count);
    }
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Список груп " + "\n" + " " +groupList + '\n';
    }
}
