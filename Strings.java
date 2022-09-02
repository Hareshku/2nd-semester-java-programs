import java.util.*;
class Strings{
public static void main(String[] args){
String s="Mehran University of Engineering and Technology Jamshoro";
System.out.println(s.concat(" Pakistan"));
System.out.println(s.length());
System.out.println(s.replace("Jamshoro","JAMSHORO")); 
System.out.println(s.replaceAll("Jamshoro","Hyderabad"));
System.out.println(s.charAt(0));
System.out.println(s.indexOf("U"));
System.out.println(s.equals("mehran university Jamshoro"));
System.out.println(s.equalsIgnoreCase("Mehran University of engineering and technology Jamshoro"));
//System.out.println(s.compareTo("Mehran university of Engineering and Technology Jamshoro"));
System.out.println(s.substring(7,18));
System.out.println(s.toCharArray());
System.out.println(s.valueOf(8));
System.out.println(s.indexOf("T"));
System.out.println( );
}
}