package Homework2;

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите дробное число (в качестве разделителя используйте запятую): ");
                float floatValue = sc.nextFloat();
                System.out.println("Ваше число  " + floatValue);
                sc.close();
                break;
            } catch (Exception e){
                System.out.println("Вы ввели не число. "); 
            }
        }
    }
}
