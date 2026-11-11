import java.util.Objects;
import java.util.Scanner;

//interest rate calculator demo
public class INrc {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in); //create a scanne object

        System.out.println("Enter starting amount of money");
        double principal = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter interest rate");
        double interest = Double.parseDouble(scanner.nextLine());
        interest = interest/100; //address a miscalculation error

        System.out.println("Enter time in years");
        double time = Double.parseDouble(scanner.nextLine());

        double Total = 0;



        System.out.println("Enter interest type - simple or compound");

        String intrType = scanner.nextLine();

        if (Objects.equals(intrType, "simple")){
            Total = (principal * interest * time);
            //Simple interest - Interest = principal * interest rate * Time (in years)
        }
        else if (Objects.equals(intrType, "compound")){
            Total = (principal * (Math.pow((1 + interest) , 2)) );
            //Compound interest - P * (1 + r)^2
        }

        System.out.println("Interest accrued £ " + Total);
        System.out.println("Total £ " + (Total + principal));



    }
}
