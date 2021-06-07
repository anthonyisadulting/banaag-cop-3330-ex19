package base;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Please enter your weight in pounds:");
        String input0 = in.nextLine();
        double weight = Double.parseDouble(input0);

        System.out.print("Please enter your height in inches:");
        String input1 = in.nextLine();
        double height = Double.parseDouble(input1);

        double bmi = (weight / (height * height))*703;

        System.out.println("Your BMI is " + bmi +".");

        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }





    }}
