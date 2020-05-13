package EXAMENRECUPERACION2;
import java.util.Scanner;

public class ReconocimientoPatrones 
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Introduce las dimensiones del array (filas y columnas");
        
        int[][] m = new int[input.nextInt()][input.nextInt()];
        boolean cuatroconsecutivos = false;
        
        System.out.println("Introduce los valores");
        for(int i = 0; i<m.length; i++)
        {
            for(int j = 0;j<m.length; j++)
                
            {
                m[i][j] = (int)Math.random()*8+1;
            }
        }
        System.out.println("La matriz :");
        for(int i = 0; i<m.length; i++)
        {
            for(int j = 0;j<m.length; j++)
                
            {
                System.out.print(m[i][j]+"");   
            }
            
            System.out.println("");
        }
        
        for(int i = 0; i<m.length; i++)
        {
            for(int j = 0;j<m.length; j++)
                
            {
                if(m[][])
            }
               
            
            
        }
        
        
       
            

        
        
    }
    
}
