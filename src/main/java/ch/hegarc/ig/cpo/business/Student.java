package ch.hegarc.ig.cpo.business;

public class Student {

    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
    private Boolean married;
    private String sex;
    
    public Student() {
    }

    public Student(Integer id, String firstname, String lastname, Integer age, Boolean married, String sex) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.married = married;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Student n°");
        sb.append(getId().toString());
        sb.append("\n");
        sb.append("Name : ");
        sb.append(getLastname());
        sb.append(" ");
        sb.append(getFirstname());

        return sb.toString();
        
    }
} 