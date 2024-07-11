package Himedia.Java.test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 대출");
            System.out.println("4. 도서 반납");
            System.out.println("5. 도서 목록");
            System.out.println("6. 나가기");

            System.out.println("원하는 작업의 번호를 입력 하시오");
            int choiceNumber = sc.nextInt();
            sc.nextLine();

            switch (choiceNumber) {
                case 1:
                    System.out.println("도서 제목을 입력하시오");
                    String title = sc.nextLine();
                    System.out.println("도서 저자를 입력하시오");
                    String author = sc.nextLine();
                    lib.addBook(new Book(title,author));
                    break;
                case 2:
                    System.out.println("삭제할 도서 제목을 입력하시오");
                    String title2 = sc.nextLine();
                    Book book = lib.findBookTitle(title2);
                    if (book != null) {
                        lib.removeBook(book);
                        System.out.println("삭제 완료");
                    }break;
                case 3:
                    System.out.println("대출을 원하는 책 제목을 입력하시오");
                    String title3 = sc.nextLine();
                    lib.borrowBook(title3);
                    break;
                case 4:
                    System.out.println("반납하실 책 제목을 입력하시오");
                    String title4 = sc.nextLine();
                    lib.returnBook(title4);
                    break;
                case 5:
                    lib.listAllBooks();
                    break;
                case 6:
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}
