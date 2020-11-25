package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {

    private ArrayList<Student> students = TechConnect.getStudentList();
    private ArrayList<Instructor> instructors = ZipcodeWilmington.getInstructorList();

    public ClassRoom(){

    }

    public HashMap<String, Person> getRoster(){
        HashMap<String, Person> map = new HashMap<String, Person>();
        for(Student s : students){
            map.put(s.getName(), s);
        }
        for(Instructor i : instructors){
            map.put(i.getName(), i);
        }
        return map;
    }
}
