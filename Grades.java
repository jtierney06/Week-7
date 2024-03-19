import java.util.Scanner;
public class Grades{
    public static void main (String[]args){
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your grade? ");
        grade = input.nextInt();
        input.close();
        if(grade >= 90 ){
            System.out.println("You have an A, nice job! ");
        }
        else if(grade >= 85){
            System.out.println("You have a B, not bad! ");
        }
        else if(grade >= 75){
            System.out.println("You have a C, it happens, you'll improve ");
        }
        else if(grade >= 70){
            System.out.println("You have a D, Slacking off? ");
        }
        else if(grade >= 65){
            System.out.println("You have an F, What are you doing?! ");
        }
    }
}