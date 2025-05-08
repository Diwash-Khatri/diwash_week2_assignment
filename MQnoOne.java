public class MQnoOne {

    static class Book {
        String title;
        String author;
        String ISBN;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        public void showDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("ONE ONE", "Rober Le", "123");
        Book book2 = new Book("1984", "George Orwell", "978-0451524935");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "233");
        Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", "876");
        Book book5 = new Book("Pride and Prejudice", "Jane Austen", "434");

        System.out.println("Library Book Details:");
        System.out.println("=========================");
        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
        book4.showDetails();
        book5.showDetails();
    }
}
