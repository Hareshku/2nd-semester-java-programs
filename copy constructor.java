class Student{
String Name,Id,Dept,Email;
Student(){
Name="Haresh";
Id="21sw053";
Dept="sw";
Email="Hareesh5434@gmail.com";
}
Student(String name,String id,String dept,String email){
Name=name;
Id=id;
Dept=dept;
Email=email;
}
Student(Student s2){
Name=s2.name;
Id=s2.id;
Dept=s2.dept;
Email=s2.email;
}
void display(){
System.out.println(Name);
System.out.println(Id);
System.out.println(Dept);
System.out.println(Email);
}
}
class Demo{
public static void main(String[] args){
Student s1=new Student();
Student s2=new Student("Hk","21sw09","Sw","fh3434@gmail.com");
Student s3=new Student(s2);
s1.display();
s2.display();
s3.display();
}
}