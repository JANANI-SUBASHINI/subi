# subi
import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    char c;
    System.out.println("Enter an character");
    c=br.readLine().charAt(0);
    if (c=='a'|| c=='A'|| c=='e'|| c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
    {
      System.out.println(c+" is an vowel");
      }
      else
      {
      System.out.println(c+" is an consonant");
      }
       }
  }
