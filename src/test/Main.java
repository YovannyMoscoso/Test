package test;
import static domain.InterviewQuestion1.sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] myArray = {1,2,3,4,5};
        int result = sum(myArray);
        System.out.println("The result of adding the numbers is: " + result);
    }
}