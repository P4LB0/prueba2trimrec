
package EXAMENRECUPERACION2;
import java.util.Scanner;
public class VerificaPassword 
{
    public static void main(String args[])
    {
        
        Scanner input = new Scanner(System.in);
        String password = new String();
        password = input.nextLine();
        
    }
    public boolean esvalido (String password)
    {
       boolean ok;
       if(password.length()< 10 )
       {
           ok = false;
       }
       for (int i = 0; i<password.length(); i++)
       {
           char[] miarray = new char[password.length()];
           char letra = password.charAt(i);
           miarray[i] = letra;
           
           switch(miarray[i])
           {
               case 0:
                   ok = true;
                   break;
               case 1:
                   ok = true;
                   break;
               case 2:
                   ok = true;
                   break;
               case 3:
                   ok = true;
                   break;
               case 4:
                   ok = true;
                   break;
               case 5:
                   ok = true;
                   break;
               case 6:
                   ok = true;
                   break;
               case 7:
                   ok = true;
                   break;
               case 8:
                   ok = true;
                   break;
               case 9:
                   ok = true;
                   break;
               case 'a':
                   ok = true;
                   break;
               case 'b':
                   ok = true;
                   break;
               case 'c':
                   ok = true;
                   break;
               case 'd':
                   ok = true;
                   break;
               case 'e':
                   ok = true;
                   break;
               case 'f':
                   ok = true;
                   break;
               case 'g':
                   ok = true;
                   break;
               case 'h':
                   ok = true;
                   break;
               case 'i':
                   ok = true;
                   break;
               case 'j':
                   ok = true;
                   break;
               case 'k':
                   ok = true;
                   break;
               case 'l':
                   ok = true;
                   break;
               case 'm':
                   ok = true;
                   break;
               case 'n':
                   ok = true;
                   break;
               case 'ñ':
                   ok = true;
                   break;
               case 'o':
                   ok = true;
                   break;
               case 'p':
                   ok = true;
                   break;
               case 'q':
                   ok = true;
                   break;
               case 'r':
                   ok = true;
                   break;
               case 's':
                   ok = true;
                   break;
               case 't':
                   ok = true;
                   break;
               case 'u':
                   ok = true;
                   break;
               case 'v':
                   ok = true;
                   break;
               case 'w':
                   ok = true;
                   break;
               case 'x':
                   ok = true;
                   break;
               case 'y':
                   ok = true;
                   break;
               case 'z':
                   ok = true;
                   break;
               
           }
       }
      return ok;
    }
}
