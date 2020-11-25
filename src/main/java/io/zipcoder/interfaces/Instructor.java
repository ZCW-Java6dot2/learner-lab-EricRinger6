package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{



    public Instructor(String name){
        super(name);
    }

    public void teach(Student student, Double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] students, Double numberOfHours) {
        Double numberOfHoursPerStudent = numberOfHours / students.length;

        for(Student s : students){
            s.learn(numberOfHoursPerStudent);
        }
    }
}
