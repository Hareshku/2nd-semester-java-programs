import java.util.Scanner;
class operands_operator{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("   Enter 1st  number");
int a=s.nextInt();
System.out.println("   Enter 2nd number");
int b=s.nextInt();
int j=a+b;
int d=a-b;
System.out.println("   Enter the operator");
char c=s.next().charAt(0);               //this line takes input one special character from the user
switch(c){
case'+':
System.out.println("   "+j);
break;
case'-':
System.out.println("    "+d);
break;
case'*':
System.out.println(a*b);
break;
case'/':
System.out.println(a/b);
break;
case'%':
System.out.println(a%b);
break;
default:
System.out.println("invalid operator");
break;
}
}
}