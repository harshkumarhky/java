1. WAP TO DISPLAY FACTORIAL 1 TO 10 NUMBERS

public class Factorial {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Factorial of " + i + " = " + factorial);
        }
    }
}
---------------------------------------------------------------------------------------------------------
2. WAP TO DISPLAY ADDITION 1 TO 100 NUMBERS

public class Addition {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
----------------------------------------------------------------------------------------------------
3. WAP TO FIND THE FACTORIAL OF NUMBER USING LOOP

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
    }
}
--------------------------------------------------------------------------------------------
4. WAP TO ACCEPT 1 NUMBER AND DISPLAY WHETHER IT IS PRIME OR NOT

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
-------------------------------------------------------------------------------------------------------------
5. WAP TO ACCEPT 1 NUMBER FROM THE USER AND CHECK IT WHETHER IT IS EVEN OR ODD


import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
----------------------------------------------------------------------------------------------
6. WAP TO DISPLAY EVEN NUMBERS FROM 1 TO 100


public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
------------------------------------------------------------------------------------------
7. WAP TO ACCEPT 1 NUMBER AND DISPLAY ITS TABLE

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}

--------------------------------------------------------------------------------------------
8. Fibonacci series
    
    import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
              }
      }
    }
------------------------------------------------------------------------------------------------
//Swapping 2 Numbers//

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
---------------------------------------------------------------------------------------------

//Calculator//


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
---------------------------------------------------------------------------------------------
// Factorial //

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
-----------------------------------------------------------------------------------------------    
 // For Loop //

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
---------------------------------------------------------------------------------------------
 // odd even //

    import java.util.Scanner;

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
