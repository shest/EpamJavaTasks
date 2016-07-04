package com.epam.spb.lection2.task1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private Map<Integer, SubProgram> menu = new HashMap<Integer, SubProgram>();

    public Main() {
    	int i = 1;
    	menu.put(i++, new ArgumentsExample());
    	menu.put(i++, new AutoPack());
    	menu.put(i++, new BigExample());
    	menu.put(i++, new BitOperations());
    	menu.put(i++, new CharsTest());
    	menu.put(i++, new ClassExample());
    	menu.put(i++, new CoverClasses());
    	menu.put(i++, new DataTypes());
    	menu.put(i++, new Import());
    	menu.put(i++, new InstanceOf());
    	menu.put(i++, new LogicOperations());
    	menu.put(i++, new Operators());
    	menu.put(i++, new StringTransformation());
    	menu.put(i++, new UnaryOperators());
    }
    
    public void execute() {
    	while (true) {
    		showMenu();

        	Scanner in = new Scanner(System.in);
       
        	if (in.hasNext()) {
            	
        		String command = in.next().toLowerCase();
        		if (command.equals("quit") || command.equals("q")) return;
    			String argsStr = in.nextLine();
    			String[] args = {};
    			if (!argsStr.isEmpty()) args = argsStr.substring(1).split(" ");
        		try {
            		int n = Integer.parseInt(command);
            		if (menu.containsKey(n)) {
                		menu.get(n).run(args);
            		}
        		} catch (NumberFormatException ex) {
        			System.err.println("Incorrect number");
        		};
        	}
        	try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    
    private void showMenu() {
    	//output menu on console
    	System.out.println("   Menu");	
    	for (int i : menu.keySet()) {
    		System.out.println(i + ": " + menu.get(i));
    	}
    	System.out.print("\nEnter program number or quit: ");
    }
    public static void main(String[] args) {
//        System.out.println("Hello guys!");
        new Main().execute();

    }
}
