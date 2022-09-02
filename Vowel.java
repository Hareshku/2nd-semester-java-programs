import java.util.Scanner;
class Vowel{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("  Enter the character:       ");
char c=s.next().charAt(0);
switch(c){
case'a':
System.out.print("  It is vowel");
break;
case'e':
System.out.print("  It is vowel");
break;
case'i':
System.out.print("  It is vowel");
break;
case'o':
System.out.print("  It is vowel");
break;
case'u':
System.out.print("  It is vowel");
break;
default:
System.out.print("  It is consonant");
break;
}
}
}
