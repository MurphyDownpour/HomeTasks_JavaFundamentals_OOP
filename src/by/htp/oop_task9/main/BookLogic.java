package by.htp.oop_task9.main;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
    private Book[] books;

    public BookLogic(Book[] books) {
        this.books = books;
    }

    public List<Book> getAuthorsBooks(String author) {
        List<Book> books = new ArrayList<Book>();

        for (Book book: this.books) {
            if (book.getAuthor().equals(author)) {
                books.add(book);
            }
        }

        return books;
    }

    public List<Book> getPublishersBooks(String publisher) {
        List<Book> books = new ArrayList<Book>();

        for (Book book: this.books) {
            if (book.getPublisher().equals(publisher)) {
                books.add(book);
            }
        }

        return books;
    }

    public List<Book> getBooksAfterPublishYear(int publishYear) {
        List<Book> books = new ArrayList<Book>();

        for (Book book: this.books) {
            if (book.getPublishYear() > publishYear) {
                books.add(book);
            }
        }

        return books;
    }
}
