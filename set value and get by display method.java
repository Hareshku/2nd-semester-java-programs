class D{
private String name,Id,dept;
void setdata(String n,String id, String d){
name=n;
Id=id;
dept=d;
}
void getdata(){
System.out.println(name);
System.out.println(Id);
System.out.println(dept);
}
}
 class S{
public static void main(String[] args){
D s1=new D();
s1.setdata("Hk","21sw04","sw");
s1.getdata();
}
}