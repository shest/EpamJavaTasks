package com.epam.spb.lection2.task1;

public class InstanceOf extends SubProgram{

    public static void doLogic(Course c) {
        if (c instanceof BaseCourse) {
            System.out.println("BaseCourse");
        } else if (c instanceof OptionalCourse) {
            System.out.println("OptionalCourse");
        } else {
            System.out.println("Что-то другое.");
        }
    }

    public static abstract class Course {

    }

    public static class BaseCourse extends Course {

    }

    public static class OptionalCourse extends Course {

    }

    public static class FreeCourse extends Course {

    }

	@Override
	public void run(String[] args) {
		doLogic(new BaseCourse());
        doLogic(new OptionalCourse());
        doLogic(new FreeCourse());
	}
	public static void main(String[] args) {
        new InstanceOf().run(args);
    }
}
