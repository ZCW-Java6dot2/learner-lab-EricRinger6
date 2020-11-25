package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestTechConnect {

    @Before
    public void setud(){
        TechConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents(){
        Student student = new Student("Mike");
        TechConnect.recruitStudent(student);
        TechConnect.removeStudents();

        Assert.assertTrue(TechConnect.getStudentList().isEmpty());
    }

    @Test
    public void testRecruitStudents(){
        Student student = new Student("Jack");
        Student actual = new Student("Dont come back");
        TechConnect.recruitStudent(student);
        TechConnect.recruitStudent(actual);

        Assert.assertEquals(TechConnect.getStudentList().get(1), actual);
    }
}
