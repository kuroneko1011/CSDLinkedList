package Employee;

import LinkedList.EmpList;

public class EmployeeManagement {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new employee");
        menu.add("Remove an employee");
        menu.add("Increase salary of an employee");
        menu.add("Print employee list");
        menu.add("Quit");

        EmpList list = new EmpList();

        int userChoice;
        do {
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case 1: list.add(); break;
                case 2: list.remove(); break;
                case 3: list.increaseSalary(); break;
                case 4: list.print(); break;
                default: System.out.println("Say you later.");
            }
        } while (userChoice > 0 && userChoice < 5);
    }
}
