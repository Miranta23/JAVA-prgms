import java.io.*;
import java.util.Scanner;
class Q1_Product
{ 
 int pcode;
 String pname;
 Float price;
 
 void read() throws IOException
 {
   System.out.print("\n");
   Scanner po = new Scanner(System.in);
   System.out.print("Enter the Product code: ");
		
   pcode=po.nextInt();
   System.out.print("Enter the product name: ");
		
   pname=po.next();
   System.out.print("Enter the product price: ");
		
   price=po.nextFloat();
   
 }
 void Display() throws IOException
 {
  System.out.print("Product code: " + pcode);
  System.out.print("\nName of the Product: " + pname);
  System.out.print("\nPrice of the product: " + price);
  
  }
public static void main(String args[])throws IOException
{
 int n;
 int emp;
 
 Q1_Product p[]=new Q1_Product[5];
 for(int i=1;i<=3;i++)
 {
  p[i]=new Q1_Product();
  p[i].read();
  
 }
 
 int min=1;
 for(int i=1;i<=3;i++)
 {
  
  if(p[min].price>p[i].price)
  {
   min=i; 
     }
  }

System.out.print("\n Product with min price  \n");
System.out.println("------------------------");
p[min].Display();


 }

}