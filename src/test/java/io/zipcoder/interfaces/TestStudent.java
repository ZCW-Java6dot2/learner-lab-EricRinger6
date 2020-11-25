package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student("Anita");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student("Gary");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Double actual = 1000.00;
        Student student = new Student("Albert");

        student.learn(actual);
        Double expected = student.getTotalStudyTime();

        Assert.assertEquals(actual, expected);
    }
}
