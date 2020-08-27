import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookImpl implements IAddressBook
{
    Scanner scanner = new Scanner(System.in);
    List<Person> list = new LinkedList<Person>();

    public void add() {
        System.out.println("enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("enter your address");
        String address = scanner.nextLine();
        System.out.println("enter your city");
        String city = scanner.nextLine();
        System.out.println("enter your state");
        String state = scanner.nextLine();
        System.out.println("enter your phone");
        long mobileNo = scanner.nextLong();
        System.out.println("enter your zip code");
        String zip = scanner.next();

        Person person = new Person(firstName, lastName, address, city, state, mobileNo, zip);
        list.add(person);
    }

    public void display() {

        for (Person person : list)
        {
            System.out.println(person);
        }

    }
}
