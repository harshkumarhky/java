1. //Swapping 2 Numbers//

public class swapping{
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        System.out.println("Before Swapping: a = " + a +", b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping: a = " + a +", b = " +b);
    }
}


2.//Calculator//


import java.util.*;
public class calculator {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double num1 = sc.nextDouble();
    System.out.println("Enter the Operator: +; -; *; /;");
    char Operator = sc.next().charAt(0);
    System.out.println("Enter the second number:");
    double num2 = sc.nextDouble();
    double result = 0;
    if(Operator == '+'){
        result = num1 + num2;
    }else if(Operator == '-'){
        result = num1 - num2;
    }else if(Operator =='*'){
        result = num1 * num2;
    }else if(Operator == '/'){
        result = num1 / num2;
    }else {
        System.out.println("Invalid Operator");
        return;
    }
    System.out.println("Result: " + result);
}  
}    

3. // Factorial //

public class factorial{
    public static void main(String[] args) {
        int a = 5; 
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + a + " is " + factorial);
    }
}    
    
