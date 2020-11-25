package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testSetName(){
        String actual = "Joe";
        Person person = new Person("Mama");

        person.setName(actual);

        String expected = person.getName();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testConstructor(){
        String actual = "Mike";
        Person person = new Person(actual);

        String expected = person.getName();

        Assert.assertEquals(actual, expected);
    }
}
