package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestZipCodeWilmington {

    @Before
    public void setup(){
        ZipcodeWilmington.fireStaff();
    }

    @Test
    public void testHireStaff(){
        Instructor instructor = new Instructor("Bruh");
        Instructor actual = new Instructor("Moment");
        ZipcodeWilmington.hire(instructor);
        ZipcodeWilmington.hire(actual);

        Assert.assertEquals(ZipcodeWilmington.getInstructorList().get(1), actual);
    }

    @Test
    public void testFireStaff(){
        Instructor instructor = new Instructor("Bert");
        Instructor instructor2 = new Instructor("Ernie");
        ZipcodeWilmington.fireStaff();

        Assert.assertTrue(ZipcodeWilmington.getInstructorList().isEmpty());
    }
}
