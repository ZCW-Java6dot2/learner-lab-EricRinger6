package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestClassRoom {

    @Test
    public void testGetRoster(){
        ClassRoom classRoom = new ClassRoom();

        HashMap<String, Person> actual = new HashMap<String, Person>();

        for(Student s : TechConnect.getStudentList()){
            actual.put(s.getName(), s);
        }
        for(Instructor i : ZipcodeWilmington.getInstructorList()){
            actual.put(i.getName(), i);
        }


        Assert.assertEquals(classRoom.getRoster().keySet(), actual.keySet());
    }

}
