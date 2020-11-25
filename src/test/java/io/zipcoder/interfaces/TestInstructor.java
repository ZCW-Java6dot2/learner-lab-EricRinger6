package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplimentation(){
        Instructor instructor = new Instructor("Joe");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor("Yamamoto");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor("Guy");
        Student student = new Student("Lee");

        Double actual = 30.00;

        instructor.teach(student, actual);

        Double expected = student.getTotalStudyTime();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor("Guy");
        Student student1 = new Student("Lee");
        Student student2 = new Student("TenTen");
        Student student3 = new Student("Neji");
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Double actual = 300.00;

        instructor.lecture(students, 900.00);

        Double expected = student1.getTotalStudyTime();

        Assert.assertEquals(actual, expected);
    }
}
