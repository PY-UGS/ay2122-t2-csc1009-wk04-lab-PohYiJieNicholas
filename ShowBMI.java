import java.util.Scanner;
public class ShowBMI {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        BMI bmi = new BMI(weight,height);

        System.out.println("BMI is "+ bmi.getBMI());
        System.out.println(bmi.getInterpretations());

        input.close();
    }
}
