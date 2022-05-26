package arraysAndstrings;

public class StringJoinerExample1 
{
	public static void main(String[] args) 
	{
	  String str = String.join(" < ", "one","two","three");	  
	  String str1 = String.join(" ", "My","Name","is","Gowtham");
	  String str2 = String.join(" -> ", "wakeup","eat","play","sleep");
	  
	  System.out.println(str);
	  System.out.println(str1);
	  System.out.println(str2);
	  
	  //String length
	  System.out.println(str2.length());
	  
	  //CharAt(index)
	  char i = str2.charAt(0);
	  System.out.println(i);
	  
	  //substring(int beginindex)
	  String sub = str2.substring(10);
	  System.out.println(sub);
	  
	 //substring(int beginindex, int endindex)
	  String sub1 = str2.substring(10,15);
	  System.out.println(sub1);
	  
	  //Concat(String str)
	  String str4 = "Gowtham";
	  String str5 = "Anusha";
	  String str9 = str5.concat(str4);
	  System.out.println(str9);
	  
	  //int index(String s)
	  int x = str9.indexOf("t");
	  System.out.println(x);
	  
	//int index(String s,int i)
	  int y = str5.indexOf("t",1);
	  System.out.println(y);
	  
	//int lastIndexOf(String s,int i)
	  int z = str5.indexOf("G");
	  System.out.println(z);
	  
	  //boolean equals( Object otherObj): Compares this string to the specified object
	  Boolean out = "Gowtham".contentEquals("Gowtham");  //=> True
	  System.out.println(out);
	  out = "Gowtham".contentEquals("gowtham"); //false
	  System.out.println(out);
	  
	//  boolean  equalsIgnoreCase (String anotherString): Compares string to another string, ignoring case considerations.
	  
	  Boolean out1 = "Gowtham".equalsIgnoreCase("Gowtham");  //=> True
	  System.out.println(out1);
	  out1 = "Gowtham".equalsIgnoreCase("gowtham"); //true
	  System.out.println(out1);
	  
	  // int compareTo( String anotherString): Compares two string lexicographically.
	  String s1 = "Gowtham";
	  String s2 = "gowtham";
	  int out2 = s1.compareTo(s2);
	  System.out.println(out2);
	  
	 /* This returns difference s1-s2. If :
		  out < 0  // s1 comes before s2
		  out = 0  // s1 and s2 are equal.
		  out > 0   // s1 comes after s2.
	 */
	  
	  //int compareToIgnoreCase( String anotherString): Compares two string lexicographically, ignoring case considerations.
	  String s3 = "Gowtham";
	  String s4 = "gowtham";
	  int out3 = s3.compareToIgnoreCase(str5);
	  System.out.println(out3);
	  /* This returns difference s1-s2. If :
	  out < 0  // s1 comes before s2
	  out = 0  // s1 and s2 are equal.
	  out > 0   // s1 comes after s2.
      */
	  
	  //String toLowerCase(): Converts all the characters in the String to lower case
	  String str6 = "Hello World";
	  System.out.println(str6.toLowerCase());
	  
	  //String toUpperCase(): Converts all the characters in the String to upper case.
	  String str7 = "Hello World";
	  System.out.println(str7.toUpperCase());
	  
	  //String trim(): Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
	  String str8 = " Gowtham Anusha ";
	  System.out.println(str8.trim());
	  
	  //String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
	  String s6 = "feeksforfeeks";
	  String s7 = s6.replace('f','g'); // returns “geeksgorgeeks”
	  System.out.println(s7);
	  
	}
}
