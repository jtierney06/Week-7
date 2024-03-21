import java.util.Scanner;
public class NumbersSum {
    public static void main (String[]args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        number = input.nextInt();
        input.close();
        int count = 1;
        int sum = 0;
        while(count <= number){
            System.out.println(count + " ");
            sum += count;
            count++;
        }
        System.out.println("The sum of the numbers are " + sum);
    }
}
