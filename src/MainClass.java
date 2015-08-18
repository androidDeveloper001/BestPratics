import singletone.SingletonDesign;

import java.util.Scanner;

/**
 * Created by jitendra.kadu on 8/17/2015.
 */
public class MainClass {

    public static void main(String args[]){

        int number_one;
        int number_two;

        Scanner mScanner = new Scanner(System.in);
        System.out.println("Desin Pattern in Java");
        System.out.println("Enter Tow numbers");

        number_one = mScanner.nextInt();
        number_two = mScanner.nextInt();


        SingletonDesign instance = SingletonDesign.getInstance();

//        send data to the singleton class to perform task
        int add = instance.doSomethings(number_one,number_two);
        System.out.println("Addition is : "+ add);
    }

}
