package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private Double totalStudyTime = 0.00;


    public Student(String name) {
        super(name);
    }

    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void setTotalStudyTime(Double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }


}
