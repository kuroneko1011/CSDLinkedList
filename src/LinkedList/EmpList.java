package LinkedList;

import java.util.Scanner;

import Employee.Employee;

public class EmpList extends LinkedList {
    Scanner sc = null;

    public EmpList() {
        super();
        sc = new Scanner(System.in);
    }

    private Node<Employee> find(String code) {
        Node<Employee> ref;
        for (ref = this.getHead(); ref != null; ref = ref.next)
            if (ref.info.getCode().toUpperCase().equals(code.toUpperCase()))
                return ref;
        return null;
    }

    public void add() {
        String code = null;
        String name = null;
        String address = null;
        int age = 0;
        System.out.println("Add new employee");
        boolean proceed = false;
        
        do {
            System.out.print("Enter employee's code: ");
            code = sc.nextLine().toUpperCase();
            proceed = (find(code) != null);
            if (proceed == true)
                System.out.println("This code is duplicated");
        } while (proceed || code.equals(""));

        do {
            System.out.print("Enter employee's name: ");
            name = sc.nextLine();
        } while (name.equals(""));

        do {
            try{
            System.out.print("Enter employee's age: ");
            age = Integer.parseInt(sc.nextLine());
            if (age < 0) throw new Exception();
            } catch(Exception e) {
                System.out.println("Salary cannot lower than 0 or blank");
            }
        } while (age <= 0);

        do {
            System.out.print("Enter employee's address: ");
            address = sc.nextLine();
        } while (name.equals(""));

        Employee emp = new Employee(code, name, age, address);
        this.addLast(emp);
        System.out.println("This employee is added.");
    }

    public void remove() {
        if (this.isEmpty()) System.out.println("The list is empty.");
        else {
            String code = null;
            System.out.println("Enter the code of employee who will be removed: ");
            code = sc.nextLine().toUpperCase();
            Node<Employee> ref = find(code);
            if (ref == null) System.out.println("He/she does not exist.");
            else {
                this.delete(ref.info);
                System.out.print("This employee has been removed.");
            }
        }
    }

    public void removeLast() {
        if (this.isEmpty()) System.out.println("The list is empty.");
        else {
                this.deleteLast();
                System.out.print("The last employee has been removed.");
            }
        }
    
        
    public void updateAddress() {
        if (this.isEmpty()) System.out.println("The list is empty.");
        else {
            String code = null;
            System.out.print("Enter the code of employee who you want to be update: ");
            code = sc.nextLine().toUpperCase();
            Node <Employee> ref = find(code);

            if (ref == null) System.out.println("He/she does not exist.");
            else {
                String oldAddress = ref.info.getAddress();
                String newAddress;
                do {
                    System.out.println("Old address: " + oldAddress + ", new address: " );
                    newAddress = sc.nextLine();
                }
                while (newAddress.equals(""));
                ref.info.setAddress(newAddress);
                System.out.print("His/her salary has been updated.");
            }
        }
    }

    public void print() {
        if (this.isEmpty()) System.out.println("The list is empty.");
        else {
            System.out.println("EMPLOYEE LIST");
            this.printAll();
        }
    }
}
