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


import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':result = a + b;
                break;
            case '-':result = a - b;
                break;
            case '*':result = a * b;
                break;
            case '/':if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
              System.out.println("The result is: " + result);
    }
}

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
    
4. // For Loop //

    import java.util.Scanner;

public class conditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      
        if (a == b) {
            System.out.println("a and b are equal");
            }
        else if (a > b) {
            System.out.println("a is greater than b");
         } else{
            System.out.println("b is greater than a");
        }
    }    
}

4. // odd even //

    import java.util.Scanner;

/**
 * oddeven
 */
public class oddeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }    
        }
    }
