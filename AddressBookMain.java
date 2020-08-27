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
            System.out.println("1.ADD  2.DISPLAY  3.EDIT  4.DELETE  5.SORT BY NAME/ZIP  6.QUIT");
            int option = scanner.nextInt();
            switch (option)

            {
                case 1:
                adress.add();
                break;

                case 2:
                adress.display();
                break;

                case 3:
                    System.out.println("enter person's frist name");
                    String name=scanner.next();
                    adress.edit(name);
                    break;

                case 6:
                check = false;
                break;
            }
        }
    }
}
