/*
*Simple Fibonacci Calculator by Apache261
*Using BigInteger class to display all the digits
**
*
*

*Fibonacci Numbers obtain by adding the two precedding numbers.
*F(n) = F(n-1) + F(n-2); where n is the Fibonacci's nth term
*
*
*
*
***** How it works? *****
* 1. Declare all the variables as BigInteger to display all the digit F(93) and up.
* 2. Assign values: 
* ....x => control the loop
* ....y => Input by the user, act as the terminal point of the loop
* ....u => starting as "1" acts as the second addend
* ....w => starting to "0" (0+1 Fibonacci start) acts as the first addend

* ....z => the sum of the two preceding Numbers
* ....add_one => acts an increment to the value
* 3. The sum of the two preceding numbers will be stored into "z", the  value of first number "w" will be stored to "u", and the value of "z" will be the value of the first number "w"
*Aug.02.2018 8:58PM



java fibonacci

*/


import java.util.Scanner;
import java.math.BigInteger;

public class fibonacci{
public static void main(String[] args){

BigInteger u,w,x,y,z,add_one;

 u = new BigInteger("1");
 w = new BigInteger("0");
 x = new BigInteger("1");
 add_one = new BigInteger("1");

Scanner scan = new Scanner(System.in);
System.out.print("Input F(): ");
y = scan.nextBigInteger();



while (x.compareTo(y.add(add_one)) != 0){
z = w.add(u);
u = w;
w = z;

System.out.println("\t F("+ x +"):  " + z);
x = x.add(add_one);
} 
}
}