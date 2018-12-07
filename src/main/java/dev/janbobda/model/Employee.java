package dev.janbobda.model;

public class Employee {
    private long id;
    private String firstName;
    private String secondName;
    private String jobTitle;
    private int age;

    public Employee(){

    }

    public Employee(long id, String firstName, String secondName, String jobTitle, int age){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.jobTitle = jobTitle;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
