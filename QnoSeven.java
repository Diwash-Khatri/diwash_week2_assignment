public class QnoSeven {
    String title;
    String author;

    public QnoSeven(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        QnoSeven myBook = new QnoSeven("To Kill a Mockingbird", "Harper Lee");
        myBook.showBook();
    }
}
