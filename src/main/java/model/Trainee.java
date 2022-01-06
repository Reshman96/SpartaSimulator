package model;

import static model.RandomNumberGenerator.getRandomInt;

public class Trainee {

    private final CourseType COURSE;

    public Trainee() {

        CourseType[] courseTypes = CourseType.values();
        COURSE = courseTypes[getRandomInt(0, courseTypes.length - 1)];
    }

    public CourseType getCourse() {
        return COURSE;
    }

}
