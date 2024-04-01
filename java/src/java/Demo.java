package java;
import java.util.*;
public class Demo {
import java.util.*;
public static void main(String argsli)
{
Scanner scan = new Scanner (System.in);
int size;
System.out.println("Enter the size of the data array: ");
size = scan.nextInt();
int data[] = new int[size];
System.out.println("Enter data bits in the array one by one: ");
for(int i = 0; i < size; i++){
System.out.println("Enter bit " + (size-i) + ":");
data[i] = scan.nextInt();
System.out.println("Enter the size of the divisor array:");
size = scan.nextInt();
int divisor[] = new int[size];
System.out.println("Enter divisor bits in the array one by one: ");
for(int i= 0;i <size;i++)
{
System.out.println("Enter bit " + (size-i) + ":");
divisor [i] = scan.nextInt();
