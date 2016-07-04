package com.epam.spb.lection2.task1;

public class LogicOperations extends SubProgram{

    private static boolean bTrue() {
        System.out.print("true ");
        return true;
    }

    private static boolean bFalse() {
        System.out.print("false ");
        return false;
    }

	@Override
	public void run(String[] args) {
		System.out.print("true ");
        if(bFalse()&&bTrue());
        System.out.println();

        if(bFalse()&bTrue());
        System.out.println();
	}
	public static void main(String[] args) {
        new LogicOperations().run(args);
    }
}
