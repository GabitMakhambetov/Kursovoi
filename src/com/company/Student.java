package com.company;

public class Student {
    private    int id;
    private      String FIO,
            birthday,
            addres,
            facultet,
            course,
            group;
    public Student(){
    }
    public int getId() {
        return id;
    }
    public String getFIO() {
        return FIO;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getAddres() {
        return addres;
    }
    public String getFacultet() {
        return facultet;
    }
    public String getCourse() {
        return course;
    }
    public String getGroup() {
        return group;
    }
    public Student(int id, String FIO, String birthday, String addres, String facultet, String course, String group) {
        this.id = id;
        this.FIO = FIO;
        this.birthday = birthday;
        this.addres = addres;
        this.facultet = facultet;
        this.course = course;
        this.group = group;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", birthday='" + birthday + '\'' +
                ", addres='" + addres + '\'' +
                ", facultet='" + facultet + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}