import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many numbers you want to calculate its average: ");

        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + "  numbers:");

        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        double result = calculateAverage(a,n);

        System.out.println("Average: " + result);

    }

    public static double calculateAverage(int[] a, int n){

        double sumOfNumbers = 0;

        for(int i=0;i<n;i++)
            sumOfNumbers += a[i];

        return sumOfNumbers/n;
    }
}