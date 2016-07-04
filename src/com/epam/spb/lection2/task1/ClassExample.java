package com.epam.spb.lection2.task1;

public class ClassExample extends SubProgram{
	@Override
	public void run(String[] args) {
		Book book = new Book("Java");
        System.out.println(book.getTitle());
	}
    public static class Book {
        private String title;

        public Book() {
        }

        public Book(String title) {
            this.title = title;
        }

        public void setTitle(String title) {
            this.title = null == title ? "no title" : title;
        }

        public String getTitle() {
            return title;
        }
    }

    public static void main(String[] args) {
    	new ClassExample().run(args);
    }

}
