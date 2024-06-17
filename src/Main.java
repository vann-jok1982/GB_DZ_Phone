import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Ivanov",123);
        phoneBook.add("Petrov",456);
        phoneBook.add("Ivanov",345);
        phoneBook.add("Sidorov",274);
        phoneBook.add("Ivanov",789);
        phoneBook.add("Petrov",567);
        phoneBook.add("Ivanov",678);

        System.out.println(phoneBook.find("Ivanov"));
        phoneBook.print();


    }
}