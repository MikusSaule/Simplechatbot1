import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello what is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        if (name.equals("Mikus")){
            System.out.println("Okay!");
            System.out.println("What programing Language are you learning?");


    }else {
            System.out.println("False");
}
        Scanner scanner1 = new Scanner(System.in);

        String java = scanner1.nextLine();

        if (java.equals("Java")){
            System.out.println("Awesome!");
            System.out.println("What wonderful school are vou learning in?");


        }else {
            System.out.println("False");
}
        Scanner scanner2 = new Scanner(System.in);

        String school = scanner2.nextLine();

        if (school.equals("Riga coding school")){
            System.out.println("Well good luck then!");


        }else {
            System.out.println("False");
        }
    }
}
