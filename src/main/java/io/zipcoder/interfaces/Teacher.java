package io.zipcoder.interfaces;

public interface Teacher {
    void teach(Student student, Double numberOfHours);
    void lecture(Student[] students, Double numberOfHours);
}
