public class MQnoFive {

    static class Movie {
        String name;
        String language;
        double rating;

        public Movie(String name, String language, double rating) {
            this.name = name;
            this.language = language;
            this.rating = rating;
        }

        public void displayMovieDetails() {
            System.out.println("Name: " + name);
            System.out.println("Language: " + language);
            System.out.println("Rating: " + rating + "/5");
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Wanted", "Hindi", 4.8);
        Movie movie2 = new Movie("Hostel", "Nepali", 4.6);
        Movie movie3 = new Movie("Hostel 2", "Nepali", 4.9);
        Movie movie4 = new Movie("Dangal", "Hindi", 4.7);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
        movie4.displayMovieDetails();
    }
}
