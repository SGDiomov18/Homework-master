import java.util.*;


public class Main


{
    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in);

        Dog myDog = new Dog();


        System.out.println("\nEnter your dog's attributes");
        System.out.println("  ------> here <------");

        System.out.println("Name: ");
        String name = scan.nextLine();
        myDog.getName(name);

        System.out.println("Age: ");
        int age = scan.nextInt();
        myDog.getAge(age);



        System.out.println("\nYour dog's name is " + name  +  " and is " +  age +  " year(s) old!");















    }
}