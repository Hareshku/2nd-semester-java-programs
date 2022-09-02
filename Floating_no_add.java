/*Write a java program that declares 5 floating numbers
 and print their total sum and average*/

class Floating_no_add{
public static void main(String[] args){
float a=3.5f;
float b=5.4f;
float c=2.3f;
float d=5.1f;
float e=4.6f;
float sum=a+b+c+d+e;
double avg=sum/5;
System.out.println("Total sum is = "+sum);
System.out.println("Average is = "+avg);
}
}