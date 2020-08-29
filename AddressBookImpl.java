import java.util.*;
import java.util.stream.Collectors;

public class AddressBookImpl implements IAddressBook {
    Scanner scanner = new Scanner(System.in);
    List<Person> list = new LinkedList<>();
    Person person = null;

    public void add()
    {
       System.out.println("enter your first name:");
        String firstName = scanner.nextLine();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getFirstName().equalsIgnoreCase(firstName)){
                System.out.println("plese enter valid name this name is already exist");
                return;
            }
        }

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
        String zip = scanner.nextLine()+scanner.nextLine();


       person = new Person(firstName, lastName, address, city, state, mobileNo, zip);

       list.add(person);
    }

    public void display() {

        for (Person person : list)
        {
            System.out.println(person);
        }

    }

    public void edit(String firstName)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName))
            {
                Person person = list.get(i);
                System.out.println(person);
                Scanner scanner = new Scanner(System.in);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
                String address = scanner.nextLine();
                person.setAddress(address);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
                String city = scanner.nextLine();
                person.setCity(city);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
                String state = scanner.nextLine();
                person.setState(state);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
                String zip = scanner.nextLine();
                person.setPincode(zip);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
                int PhoneNo = scanner.nextInt();
                person.setMobileNo(PhoneNo);


                System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
            }
        }

    }

    public void deletePersonData(String name)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getFirstName().equalsIgnoreCase(name))
            {
                Person person = list.get(i);
                list.remove(person);
            }
        }
    }

    public void sortByFirstName()
    {
        Collections.sort(list,( p1,p2)  -> p1.getFirstName().compareTo(p2.getFirstName()));
        System.out.println(list);
    }

    public void sortByPinCode()
    {
        Collections.sort(list, (p1, p2) ->p1.getPincode().compareTo(p2.getPincode()));
        System.out.println(list);

    }

    public void viewByCity(String city)
    {

        List<Person> people = list.stream().filter(person1 -> person1.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        for (Person person: people )
        {
            System.out.println(person);
        }

    }
    public void viewByState(String state)
    {
        List<Person> people = list.stream().filter(person1 -> person1.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
        for (Person person: people )
        {
            System.out.println(person);
        }
    }

//    public void searchPersonInCity(String firstName)
//    {
//        List<Person> people = list.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
//
//        for (Person person: people)
//        {
//            System.out.println(person.getFirstName()+"---->"+person.getCity());
//        }
//    }
//
//    public void searchPersonInState(String firstName)
//    {
//        List<Person> people = list.stream().filter(person1 -> person1.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
//        for (Person person: people)
//        {
//            System.out.println(person.getFirstName()+"---->"+person.getState());
//        }
//    }

}
