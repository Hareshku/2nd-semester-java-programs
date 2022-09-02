class F{
String Name;
String Id;
String Dept;
void setData(String n, String id, String dept){
Name=n;
Id=id;
Dept=dept;
}
String getName(){
return Name;
}
String getId(){
return Id;
}
String getDept(){
return Dept;
}
}
class Fdemo{
public static void main(String[] args){

String h;
String k;
String d;
F s1=new F();
s1.setData("xy","21sw0","Sw");

h=s1.getName();
k=s1.getId();
d=s1.getDept();
System.out.println(h);
System.out.println(k);
System.out.println(d);
}
}
