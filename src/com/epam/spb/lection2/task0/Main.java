package com.epam.spb.lection2.task0;

public class Main {

	private <T extends Number> Object castByte(T x, String type) {
		switch (type) {
		case "Short":
			return x.shortValue();
		case "Integer":
			return x.intValue();
		case "Long":
			return x.longValue();
		case "Float":
			return x.floatValue();
		case "Double":
			return x.doubleValue();
		default:
			throw new ClassCastException();
		}
	}

	private <T extends Number> Object castShort(T x, String type) {
		switch (type) {
		case "Integer":
			return x.intValue();
		case "Long":
			return x.longValue();
		case "Float":
			return x.floatValue();
		case "Double":
			return x.doubleValue();
		default:
			throw new ClassCastException();
		}
	}
	
	private <T> Object castChar(T x, String type) {
		switch (type) {
		case "Integer":
			return (int)(char) x;
		case "Long":
			return (long)(char) x;
		case "Float":
			return (float)(char) x;
		case "Double":
			return (double)(char) x;
		default:
			throw new ClassCastException();
		}
	}

	private <T extends Number> Object castInt(T x, String type) {
		switch (type) {
		case "Long":
			return x.longValue();
		case "Float":
			return x.floatValue();
		case "Double":
			return x.doubleValue();
		default:
			throw new ClassCastException();
		}
	}

	private <T extends Number> Object castLong(T x, String type) {
		switch (type) {
		case "Float":
			return x.floatValue();
		case "Double":
			return x.doubleValue();
		default:
			throw new ClassCastException();
		}
	}

	private <T extends Number> Object castFloat(T x, String type) {
		switch (type) {
		case "Double":
			return x.doubleValue();
		default:
			throw new ClassCastException();
		}
	}

	public <T> Object cast(T x, Class<?> newType) throws ClassCastException {
		if (x.getClass().equals(newType))
			return x;
		switch (x.getClass().getSimpleName()) {
		case "Byte":
			return castByte((Number) x, newType.getSimpleName());
		case "Short":
			return castShort((Number) x, newType.getSimpleName());
		case "Character":
			return castChar(x, newType.getSimpleName());
		case "Integer":
			return castInt((Number) x, newType.getSimpleName());
		case "Long":
			return castLong((Number) x, newType.getSimpleName());
		case "Float":
			return castFloat((Number) x, newType.getSimpleName());
		default:
			return new ClassCastException("Wrong type");
		}
	}

	public static void main(String[] args) {
		Main test = new Main();
		short i = 345;
		try {
			Object b = test.cast(i, Integer.class);
			System.out.println(b + " " + b.getClass());
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}
	}
}
