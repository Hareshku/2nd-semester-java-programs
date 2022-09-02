import java.util.*;
class B{
public static void main(String args[]){
int a=0;

int arrays[]={1,2,3,4,5};
for(int i=0; i<5;i++){
System.out.println(arrays[i]);
}
Scanner sc=new Scanner(System.in);
System.out.println("Enter the x ");
int x=sc.nextInt();
for(int i=0; i<5;i++){
if(arrays[i]==x){
System.out.println("xfound at index "+i);
a++;
break;
}
}
if(a==0){
System.out.println("X not found");
}
}
}