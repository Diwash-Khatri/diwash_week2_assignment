public class MQnoEight {

    static class Contact {
        String name;
        String phoneNumber;
        String emailAddress;

        public Contact(String name, String phoneNumber, String emailAddress) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        public void displayContactDetails() {
            if (!emailAddress.isEmpty()) {
                System.out.println("Name: " + name);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Email Address: " + emailAddress);
                System.out.println("--------------------");
            }
        }
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact("Aaa", "1234567890", "aaa@gmail.com");
        Contact contact2 = new Contact("Bbb", "9876543210", "bbb@gmail.com");
        Contact contact3 = new Contact("Ccc", "1122334455", "ccc@gmail.com.com");

        contact1.displayContactDetails();
        contact2.displayContactDetails();
        contact3.displayContactDetails();
    }
}
