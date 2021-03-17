
package ch.hegarc.ig.cpo.business;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    
    private List<Student> students = new ArrayList<>();
    private String code;

    public StudentList() {
    }

    public StudentList(String code) {
        this.code = code;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public static StudentList newPopulatedStudents(){
        StudentList studentList = new StudentList("3IGTP");
        studentList.getStudents().add(new Student(1, "Gamma", "Erich", 55, true, "M"));
        studentList.getStudents().add(new Student(2, "Stamm", "Marielle", 71, false, "W"));
        studentList.getStudents().add(new Student(3, "Wozniak", "Steve", 66, true, "M"));
        
        return studentList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("-- My students' list --\n");
        
        for (Student s: getStudents()) {
            sb.append(s);
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
}