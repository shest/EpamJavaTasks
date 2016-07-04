package com.epam.spb.lection2.task1;

import java.math.BigInteger;

public class BigExample extends SubProgram{
	@Override
	public void run(String[] args) {
		BigInteger numI1, numI2, bigNumI;
        numI1 = BigInteger.valueOf(1_000_000_000_000L);

        numI2 = numI1.multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

	}
	
    public static void main(String[] args) {
    	new BigExample().run(args);
    }
}
