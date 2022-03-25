import java.util.Scanner;

public class FizzBuzz {

    public String getNum(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 15 == 0) return "FizzBuzz";
        else if (number % 5 == 0){
            return "buzz";
        }
        else if(number % 3 == 0){
            return "fizz";
        }
        else {
            return String.valueOf(number);
        }
    }
}
