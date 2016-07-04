package com.epam.spb.lection2.task1;

abstract class SubProgram {
	abstract void run(String[] args);
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
