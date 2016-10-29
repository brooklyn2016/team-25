
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;
public class Vioce 
{

	public static void main(String[] args) 
	{
		double x[] = new double[11];
		double y[] = new double[11];
		double z[] = new double[11];
		double sum12[] = new double [11];
		double sum23[] = new double [11];
		
		double sum1 = 0;
		double sumx = 0;
		double sumy = 0;
		double sumz = 0;
		double sumxy = 0;
		double similarity =0;
		
		int i=0,j=0,n=0,k=0;
				
		for(i=0;i<=10;i++){
			x[i] = i;
			System.out.println(x[i]);
		}System.out.println();
		
		for(n=0;n<=10;n++)
		{
			z[n] = n;
			System.out.println(1.5*z[n]);
		}System.out.println();
		
		for( j=0;j<=10;j++)
		{
			y[j] = j;
			System.out.println(1.1*y[j]);
		}System.out.println();
		
		j=0;i=0;int s=0;n=0;
		for(k=0;k<=10;k++)
		{
			sum12[k] = x[i]*y[j];
			sum1 += sum12[k];
			j++;i++;
		}System.out.println();
		
		j=0;i=0;n=0;
		for(n=0;n<=10;n++)
		{
			sumx += x[i]*x[i];
			sumy += y[j]*y[j];
			j++;i++;
		}
		sumxy += sumx*sumy;
		similarity = sum1/ Math.sqrt(sumxy);
		
		System.out.println(similarity);
		
		if(similarity >=0.9){
			System.out.print("apple");//the  
		}
		else
			System.out.print("Please enter the word");
		
	}
}
















