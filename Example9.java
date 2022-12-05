package Operator;

//Logical && and Bitwise &

public class Example9 {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c); // false && true = false
        System.out.println(a < b & a < c); //false & true = false
        System.out.println(a > b && a < c); //true & true = true
        System.out.println(a > b & a < c); //true & true = true
        System.out.println(b < c & c < a); //true & false = false
    }
}
