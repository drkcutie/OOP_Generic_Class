package Arithmetic;

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        char op1 = ' ', op2 = ' ';
        Number num1 , num2;


         Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter data type of number 1 (Double - D, Integer - I , Float - F, Short - S, L - Long): ");
                op1 = sc.next().charAt(0);
                if(op1 != 'D'&& op1 != 'L'&& op1 != 'I'&& op1 != 'S'&& op1 != 'F')
                {
                    throw new RuntimeException("Invalid input");
                }
                break;
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }while (true);

        num1 = initializeNumber(op1);
        do {
            try {
                System.out.print("Enter data type of num2 (Double - D, Integer - I , Float - F, Short - S, L - Long): ");
                op2 = sc.next().charAt(0);
                  if(op2 != 'D'&& op2!= 'L'&& op2 != 'I'&& op2 != 'S'&& op2 != 'F')
                {
                    throw new RuntimeException("Invalid input");
                }
                break;
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }while (true);
        num2 = initializeNumber(op2);
        System.out.println("\n");


        Arithmetic arithmetic = new Arithmetic(num1, num2);
        char tasks = ' ';
        do {
            System.out.print("Enter operation(A - Add, M - Multiply , D- Divide, S - Subtract, g - getMin G- getMax): ");
            tasks = sc.next().charAt(0);
        switch (tasks)
        {
            case 'A':
                System.out.println(arithmetic.add());
                break;
            case 'M':
                System.out.println(arithmetic.multiply());
                break;
            case 'D':
                try{
                    System.out.println(arithmetic.divide());
                }catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                break;
            case 'S':
                System.out.println(arithmetic.substract());
                break;
            case 'g':
                System.out.println(arithmetic.getMin());
                break;
            case 'G':
                System.out.println(arithmetic.getMax());
                break;
            case 'x':
                System.out.println("Thank you. Exiting program");
                break;
            default:
                System.out.println("Invalid input");

        }
        }while(tasks != 'x');


    }


    public static Number initializeNumber(char Datatype) throws RuntimeException
    {
        Scanner sc = new Scanner(System.in);
        return switch (Datatype) {
            case 'D' -> {
                System.out.print("Enter double number: ");
                yield sc.nextDouble();
            }
            case 'I' -> {
                System.out.print("Enter integer number: ");
                yield sc.nextInt();
            }
            case 'S' -> {
                System.out.print("Enter short number: ");
                yield sc.nextShort();
            }
            case 'F' -> {
                System.out.print("Enter float number: ");
                yield sc.nextFloat();
            }
            case 'L' -> {
                System.out.print("Enter long number: ");
                yield sc.nextLong();
            }
            default -> throw new IllegalArgumentException("Invalid type");
        };


    }


}