package org.example;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Иван", "Иванов", "105", 5);
        Aspirant aspirant = new Aspirant("Ирина", "Сизова", "108", 4.5, "work");
        Student aspirant1 = new Aspirant("Артур","Пирожков","109",3,"work1");

        Student[] group = {student,aspirant,aspirant1};
        for(Student s: group){
            System.out.println(s.getScolarship());
        }

    }
}
