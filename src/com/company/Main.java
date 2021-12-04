package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] student = new Student[]{new Student(1, "Zhndos", "07.11.2002", "Nur-sultan", "FIT", "2", "SIB-27"),
                new Student(2, "Bolat", "07.11.2003", "Almaty", "FEN", "2", "IS-27"),
                new Student(3, "Zhan", "07.11.2004", "Kokshetau", "FIT", "1", "SIB-17")};


        String[] stid= new String[4];
        System.out.println("Введите данные о студенте:");
        System.out.println("Если не знаете указнные данные о студенте пишите 'none'");
        System.out.println("Имя студента:");
        String name;
        try{
            name = sc.nextLine();
        }catch (InputMismatchException cl){
            name= "none";
        }
        if(name!="none") {

            for (int i = 0; i < 3; ++i) {
                if (student[i].getFIO().equalsIgnoreCase(name)) {
                    stid[i] = student[i].toString();
                }
            }
        }
        System.out.println("Родной город:");
        String city;
        try{
            city= sc.nextLine();
        }catch (InputMismatchException cl){
            city= "none";
        }

        if(city!="none") {
            for (int i = 0; i < 3; ++i) {
                if (student[i].getAddres().equalsIgnoreCase(city)) {
                    stid[i] = student[i].toString();
                }
            }
        }
        System.out.println("Факултет:");
        String facul;
        try{
            facul= sc.nextLine();
        }catch (InputMismatchException cl){
            facul= "none";
        }
        if(facul!="none") {
            for (int i = 0; i < 3; ++i) {
                if (student[i].getFacultet().equalsIgnoreCase(facul)) {
                    stid[i] = student[i].toString();
                }
            }
        }

        System.out.println("Курс:");
        String Course;
        try{
            Course= sc.nextLine();
        }catch (InputMismatchException cl){
            Course= "none";
        }
        if(Course!="none") {
            for (int i = 0; i < 3; ++i) {
                if (student[i].getCourse().equalsIgnoreCase(Course)) {
                    stid[i] = student[i].toString();
                }
            }
        }
        System.out.println("Группа:");
        String Group;
        try{
            Group= sc.nextLine();
        }catch (InputMismatchException cl){
            Group= "none";
        }
        if(Group!="none") {
            for (int i = 0; i < 3; ++i) {
                if (student[i].getGroup().equalsIgnoreCase(Group)) {
                    stid[i] = student[i].toString();
                }
            }
        }

        for(int i=0; i<stid.length-1;i++){
            if(stid[i]!=null){
                System.out.println(stid[i]);
            }
        }
    }
}