import java.io.*;
public class Matrix {
	
	    public static void main(String args[]) throws IOException
	    {
	    	BufferedReader BR=new BufferedReader(new InputStreamReader (System.in));
	        int Number[][]=new int[1][3];
	        int i,j;
	        String m;
	        System.out.println("Enter Elements for Matrix 1x3 :");
	        for(i=0;i<=0;i++)
	        {
	            for(j=0;j<=2;j++)
	            {
	            	m=BR.readLine();
	                Number[i][j]=Integer.parseInt(m);
	            }
	        }
	        System.out.println("Elements in Matrix are : ");
	           System.out.println("");
	        for(i=0;i<=0;i++)
	        {
	            for(j=0;j<=2;j++)
	            {
	                System.out.print(Number[i][j]+"\t");
	            }
	            System.out.println();
	        }
	    }
	}



