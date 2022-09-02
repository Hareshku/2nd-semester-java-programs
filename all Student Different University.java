class F{
String Name, Rollno,Dept,Uni;
F(String n,String rn,String d,String u){
Name=n;
Rollno=rn;
Dept=d;
Uni=u;
}
void display(){
System.out.println(Name);
System.out.println(Rollno);
System.out.println(Dept);
System.out.println(Uni);
}


}
class K{
public static void main(String[] args){
F f=new F("KL","21ws","te","Mehran");
F f1=new F("KL","21cs2","Cs","NED");
F f2=new F("KL","21me","Me","Nust");
F f3=new F("KL","21ws","te","Dawoo");
F f4=new F("KL","21ws","te","Lumbs");
f.display();
f1.display();
f2.display();
f3.display();
f4.display();
}
}