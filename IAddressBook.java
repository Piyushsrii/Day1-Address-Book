public interface IAddressBook
{
     void add();
     void display();
     void edit(String firstName);
     void deletePersonData(String firstName);
     void sortByFirstName();
     void sortByPinCode();
     void viewByCity(String city);
     void viewByState(String state);
   //  void searchPersonInCity(String firstName);
    // void searchPersonInState(String firstName);

}

