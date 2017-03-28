
import java.io.*;
public class Demo
{
  public static void main(String args[])
  {
    try ( 
          FileReader fr = new FileReader("abc.txt");   // Try with Resources Example, fr closes implicitly
          FileWriter fw = new FileWriter("def.txt");   // Try with Resources Example, fw closes implicitly
        )
        {
          // some file copying code
        }            // at this point fr and fw are closed
        catch (IOException e) 
        {
          e.printStackTrace();
        }
  }