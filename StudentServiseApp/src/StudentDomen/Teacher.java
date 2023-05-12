package StudentDomen;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    
    private int teacerId;
    private String academicDegree;
    private Long id;
    private static List<Long> idTeacher = new ArrayList<>();

    public Teacher(String firstName, String secondName, int age, int teacerId, String academicDegree ) {
        super(firstName, secondName, age);
       this.teacerId = teacerId;
       this.academicDegree = academicDegree;
    }

    public int getTeacerId() {
        return teacerId;
    }

    public void setTeacerId(int teacerId) {
        this.teacerId = teacerId;
    }

    public String getLevel() {
        return academicDegree;
    }

    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    private void setId(Long id) {
        this.id = id;
    }
    
    public static List<Long> getIdTeacher() {
        return idTeacher;
    }

    public Long getId() {
        return id;
    }
}