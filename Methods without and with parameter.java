/*
Method without parameter

class Method{
String sName;
String sId;
String sdept;
void display(){                                      //Method
System.out.println("Student Name is    "+sName);
System.out.println("Student ID is      "+sId);
System.out.println("Student department is    "+sdept);
}
}
class EmployeeDamo{
public static void main(String[] args)                  //Main class
{
S e1=new S();
e1.sName="Hkumar";
e1.sId="21sw053";
e1.sdept="sw";
e1.display();
}
}*/


//Method with parameter

class Method{
String sName;
String sId;
String sdept;
void setValue(String n,String id,String dept){                //  set value Method
sName=n;
sId=id;
sdept=dept;
}
void display(){                                              //   display Method
System.out.println("Student Name is    "+sName);
System.out.println("Student ID is      "+sId);
System.out.println("Student department is    "+sdept);
}
}
class EmployeeDamo{                                           // Main class
public static void main(String[] args)
{
S s1=new S();
s1.setValue("Hkumar","21sw053","SW");
s1.display();
}
}