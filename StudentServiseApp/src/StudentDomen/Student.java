package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private long studentID;

    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getLastName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        if (super.getAge() == student.getAge()) {
            if (this.getAge() == student.getAge()) {
                return 0;
            }
            if (this.getAge() < student.getAge()) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < student.getAge()) {
            return -1;
        }
        return 1;
    }


}