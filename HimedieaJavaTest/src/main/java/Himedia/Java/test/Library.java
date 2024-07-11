package Himedia.Java.test;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findBookTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        System.out.println("원하시는 책이 없습니다.");
        return null;
    }

    public void borrowBook(String title) {
        Book book = findBookTitle(title);
        if(book != null) {
            if(!book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("책 대출 완료");
            }else {
                System.out.println("현재 다른 사람이 대출 중입니다.");
            }
        }
    }
    public void returnBook(String title) {
        Book book = findBookTitle(title);
        if(book != null) {
            if(book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("책 반납 완료");
            }else {
                book.setBorrowed(true);
                System.out.println("해당 책은 대출 한 적이 없습니다.");
            }
        }
    }
    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
