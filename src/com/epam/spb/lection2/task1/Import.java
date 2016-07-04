package com.epam.spb.lection2.task1;

import static java.lang.Math.pow;
import static java.lang.Math.PI;


public class Import extends SubProgram{
    private int i = 20;

    public void staticImport() {
        double x;
        x = pow(i, 2)*PI;
        System.out.println("x=" + x);
    }

	@Override
	public void run(String[] args) {
		System.out.println("Import");
		staticImport();
	}
	
	public static void main(String[] args) {
        new Import().run(args);
    }
}
