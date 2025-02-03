//Import the Scanner package
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner form = new Scanner(System.in); //Scanner object

        //Prompt message
        System.out.println("Good morning patient! We will be filling out your medical form. Please fill out the form according to the prompts below: ");
        //Scanner Object: Get Patient Name
        System.out.println("Full Name: ");
        String name;
        name = form.nextLine();
        //Scanner Object: Get Patient Age;
        System.out.println("Age: ");
        int age;
        age = form.nextInt();
        //Scanner Object: Get Patient Weight
        System.out.println("Weight (in pounds(lbs)): ");
        double weight;
        weight = form.nextDouble();
        //Scanner Object: Get Patient Statement;
        System.out.println("Do you smoke regularly? (true/false): ");
        boolean smoker;
        smoker = form.nextBoolean();

        //Create Output
        System.out.println();
        System.out.println("Patient Form");
        System.out.println("============");
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Does patient smoke: " + smoker);
        System.out.println("============");

        //Close Scanner Object
        form.close();

    }


}
