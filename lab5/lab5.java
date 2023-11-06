package lab5;

import java.util.Scanner;

public class lab5 {
    //
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Cat pisica1 = new Cat("Pepe", "Grey", 1);

        System.out.println(pisica1.getName());
        System.out.println(pisica1.getAge());
        System.out.println(pisica1.getColour());

        pisica1.feed();
        pisica1.play();
        pisica1.sleep();


        Employee angajat1 = new Employee();
        System.out.println("\nIntroduceti numele angajatului");
        angajat1.setName(scanner.nextLine());

        System.out.println("Introduceti emailul angajatului:");
        angajat1.setEmail(scanner.nextLine());

        System.out.println("Introduceti hour rate(salar pe ora):");
        angajat1.setHourRate(scanner.nextInt());

        System.out.println("Introduceti capacity(ore lucrate pe zi):");
        angajat1.setCapacity(scanner.nextInt());

        System.out.println("Introduceti free day:");
        angajat1.setFreeDay(scanner.nextInt());

        angajat1.calculateMonthlyIncome();
    }
}
