package Operator;

//Shift operator >> vs >>>
public class Example8 {

    public static void main(String[] args) {

        System.out.println(20 >> 2);
        System.out.println(20 >>> 2); //for positive nos, >> and >>> work same

        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2); //for negative nos, >>> changes parity bit(MSB) to 0
    }
}
