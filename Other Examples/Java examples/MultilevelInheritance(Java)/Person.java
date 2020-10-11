package question3;

import java.util.Scanner;

public class Person {
    public String name;
    public String dob;
    public String nationality;

    Scanner input = new Scanner(System.in);

    public Person() {
        System.out.print("enter name: ");
        this.name = input.nextLine();
        System.out.print("enter dob: ");
        this.dob = input.nextLine();
        System.out.print("enter nationality: ");
        this.nationality = input.nextLine();
    }

    public void showDetails(){
        System.out.println("name: "+this.name);
        System.out.println("dob: "+this.dob);
        System.out.println("nationality: "+this.nationality);
    }
}