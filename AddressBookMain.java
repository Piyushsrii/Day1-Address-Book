import java.util.Scanner;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        AddressBookImpl adress = new AddressBookImpl();
        boolean check = true;
        while (check == true)
        {
            System.out.println("1.ADD  2.DISPLAY  3.EDIT  4.DELETE  5.SORT BY NAME  6.SORT BY ZIP   7.QUIT");
            int option = scanner.nextInt();
            switch (option)

            {
                case 1:
                adress.addMultiplePerson();
                break;

                case 2:
                adress.display();
                break;

                case 3:
                    System.out.println("enter person's frist name");
                    String name=scanner.next();
                    adress.edit(name);
                    break;
               case 4:
                    System.out.println("enter person's name");
                    String firstName=scanner.next();
                    adress.deletePersonData(firstName);
                    System.out.println("You have sucessfully deleted person's data");
                    break;
               case 5:
                    address.sortByFirstName();

                case 6:
                    address.sortByPinCode();

                case 7:
                    check = false;
                    System.out.println("Thankyou for your time");
            }
        }
    }
}
