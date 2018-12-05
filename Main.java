package PACKAGE_NAME;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        System.out.println("hello world!");
        System.out.println("\nFull name: Gursky Sergei Viktorovich \nAdress: Minsk Landera street 52 \nPhone number: +375 (33) 669 24 97");
        defineArraysType(1, 2, 3, 4, 5, 6, 7);
        stringTest();
        arrayAnalyse();
        calculateParameters();
    }

    public static void calculateParameters() {
        System.out.println("Input the value of rectangle sides: ");
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        System.out.println("Hypotenuse: " + Math.sqrt(side1 * side1 + side2 * side2));
        System.out.println("Square: " + side1 * side2 / 2);
    }

    public static void arrayAnalyse() {
        int sum = 0;
        System.out.println("Input K: ");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println("\nSum is: " + sum);
    }

    public static void stringTest() {
        String my = "My ";
        String string = "string";
        System.out.println(my.concat(string));
        System.out.println(string.charAt(2));
        System.out.println(string.toUpperCase());
        System.out.println(my.hashCode());
        System.out.println(string.substring(2, 5));
    }

    public static void defineArraysType(int... array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int a = 0;
        for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
            if (array[i] < array[j]) {
                a++;
            }
        }
        if (a == array.length) {
            System.out.println("\nYes");
        }else{
            System.out.println("\nNo");
        }
    }
}
