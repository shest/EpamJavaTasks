package com.epam.spb.lection2.task1;

public class UnaryOperators extends SubProgram{

	@Override
	public void run(String[] args) {
		System.out.println("UnaryOperators");

        int i=3;
        i = -i++ + i++ + -i;

        System.out.println(i);
	}
	public static void main(String[] args) {
        new UnaryOperators().run(args);
    }
}
