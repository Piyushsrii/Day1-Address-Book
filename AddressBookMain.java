import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAddressBook address = new AddressBookImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.ADD  2.DISPLAY  3.EDIT  4.DELETE  5.SORT BY NAME   6.SORT BY ZIP 7.view by city or state 8.search person in city or state 9.QUIT");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    address.add();
                    break;
                case 2:
                    address.display();
                    break;
                case 3:
                    System.out.println("enter person's first name");
                    String name = scanner.next();
                    address.edit(name);
                    break;
                case 4:
                    System.out.println("enter person's name");
                    String firstName = scanner.next();
                    address.deletePersonData(firstName);
                    System.out.println("You have sucessfully deleted person's data");
                    break;
                case 5:
                    address.sortByFirstName();
                    break;
                case 6:
                    address.sortByPinCode();
                    break;

                case 7:
                    System.out.println("press 1 for view by city and 2 for view by state");
                    int localOption = scanner.nextInt();
                    if (localOption == 1)
                    {
                        System.out.println("enter city name");
                        String city = scanner.next();
                        address.viewByCity(city);
                        break;
                    }
                    else
                    {
                        System.out.println("enter state name");
                        String state = scanner.next();
                        address.viewByState(state);
                        break;
                    }
//                case 8:
//                    System.out.println("press 1 for search person in city and 2 for seatch person in  state");
//                    int localOption1 = scanner.nextInt();
//                    if (localOption1 == 1)
//                    {
//                        System.out.println("enter person firstName");
//                        String firstname = scanner.next();
//                        address.searchPersonInCity(firstname);
//                        break;
//                    }
//                    else
//                    {
//                        System.out.println("enter state firstName");
//                        String firstname = scanner.next();
//                        address.searchPersonInState(firstname);
//                        break;
//
//                    }
                case 9:
                    check = false;
                    System.out.println("Thankyou for your time");
                    break;
                default:
                    System.out.println("please enter valid choices as mention above");
                    continue;

            }
        }
    }
}
