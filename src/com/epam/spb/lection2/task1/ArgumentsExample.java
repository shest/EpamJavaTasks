package com.epam.spb.lection2.task1;


public class ArgumentsExample extends SubProgram {
	@Override
	public void run(String[] args) {
		for(int i = 0; i < args.length; i++){
            System.out.println("Аргумент " + i + " = " + args[i]);
        }
	}
	
	public static void main(String[] args) {
        new ArgumentsExample().run(args);
    }
}
