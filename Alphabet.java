import java.io.*;
import java.util.*;

public class Alphabet  
{  
public static void Alphabet(String filename) throws NullPointerException
{
	try  
	{  
		File file=new File(filename);    //creates a new file instance  
		FileReader fr=new FileReader(file);   //reads the file  
		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((line=br.readLine())!=null)  
		{  
			sb.append(line);      //appends line to string buffer  
			sb.append("\n");     //line feed   
		}  
	fr.close();    //closes the stream and release the resources  
	System.out.println("Contents of File");  
	System.out.println(sb.toString());   //returns a string that textually represents the object  
	}  
	catch(IOException e)
	{
		System.out.println("file not found FileNotFoundException");
	} 
}
public static void Alphabet(char [] ordering) throws NullPointerException
{
	String theString = "";
	try{
	File file = new File("demo.txt");
	Scanner scanner = new Scanner(file);

	theString = scanner.nextLine();
	while (scanner.hasNextLine()) 
	{
       theString = theString + "\n" + scanner.nextLine();
	}

	order = theString.toCharArray();
	System.out.print(order);
	}
	catch(IOException e)
	{
		System.out.println("file not found");
	}
}

public static char[] order=new char[100];
public static void main(String args[])  
{  	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the file name");
	String str= sc.nextLine(); //reads string
	Alphabet(str);
	Alphabet(order);


}  
}  