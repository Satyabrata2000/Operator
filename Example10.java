package Operator;

//Logical && vs Bitwise &
public class Example10 {

    public static void main(String[] args) {
        int a=10, b=5, c=20;
        System.out.println(a<b && a++<c); //false && true = false
        System.out.println(a); //10 as 2nd condition is not checked
        System.out.println(a<b & a++ <c); //false & true = false
        System.out.println(a);
        System.out.println(a<b && a++ <c);
    }
}
