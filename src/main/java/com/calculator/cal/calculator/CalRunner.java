package com.calculator.cal.calculator;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CalRunner {
//    @Autowired

    String symbol;
    int value1, value2;

    public void dataEntry() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("here you can find sum, difference, product, quotient,reminder");
        System.out.println("enter your calculation with every thing separated by enter");

//        System.out.println("First number");
        value1 = myObj.nextInt();  // Read user input

//        System.out.println("Symbol");
        symbol = myObj.nextLine();  // Read user input
        symbol = myObj.nextLine();  // Read user input

//        System.out.println("Second number");
        value2 = myObj.nextInt();  // Read user input
        myObj.close();
    }


    public void decision() {

//        Operations operations = new Operations(value1,value2);
        Operations operations = new Operations();
        operations.setValue1(value1);
        operations.setValue2(value2);

        System.out.println("Answer:-");

        switch (symbol) {
            case "+":
                System.out.println(operations.sum());
                break;
            case "-":
                System.out.println(operations.difference());
                break;
            case "*":
                System.out.println(operations.product());
                break;
            case "/":
                System.out.println(operations.quotient());
                break;
            case "%":
                System.out.println(operations.reminder());
                break;

        }
    }

}
