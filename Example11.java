package Operator;

//Logical || and Bitwise |
public class Example11 {

    public static void main(String[] args) {
        int a=10, b=5, c=20;
        System.out.println(a>b || a<c); //true || true = true
        System.out.println(a>b | a<c); //true | true = true
        System.out.println(a>b | a>c); //true | false = true
        System.out.println(a<b | a>b); //false | true = true
        System.out.println(a<b | a<b); //false | false = false

    }
}
