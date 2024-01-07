package TASK_4;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял(а) " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял(а) книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял(а) книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул(а) " + numberOfBooks + " книги");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул(а) книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул(а) книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + ", ");
        }
        System.out.println();
    }

    public String getFullName() {
        return fullName;
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("Nina", 12345, "Physics", "17.08.2000", "123-456-7890");
        Reader reader2 = new Reader("Merey", 54321, "Math", "05.12.2003", "987-654-3210");

        reader1.takeBook(3);
        reader2.takeBook("Психология", "Словарь", "Поэма");

        Book book1 = new Book("Чистый PYTHON", "Бейдер Д");
        Book book2 = new Book("Убеждай и побеждай", "Никита Непряхин");

        reader1.returnBook(book1, book2);
        reader2.returnBook(2);
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
}

