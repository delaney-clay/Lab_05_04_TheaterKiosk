import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.print("Please enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            if(age >= 21)
            {
                System.out.println("You get a wristband!");
            }
        }
        else
        {
            System.out.println("Please enter a valid age.");
        }
    }
}