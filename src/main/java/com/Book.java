package com;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Book {
    private static final Book masterBook = new Book("Master of the rings");
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public static void main(String... args) {
        System.out.println(masterBook);
//        masterBook = new Book("Мама мыла раму!");
        masterBook.setTitle("Мама мыла раму!");
        System.out.println(masterBook);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
