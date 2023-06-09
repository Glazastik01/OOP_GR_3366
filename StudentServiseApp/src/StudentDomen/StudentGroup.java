package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    
    private List<Student> students;
    
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            
            private Integer index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(index++);
            }

        };
    }

    @Override
    public int compareTo(StudentGroup o) {

        if (getStudents().size() == o.getStudents().size()) {
            return 0;
        }
        if (getStudents().size() < o.getStudents().size()) {
            return -1;
        }
        return 1;

    }

}