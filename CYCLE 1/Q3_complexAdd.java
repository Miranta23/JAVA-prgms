import java.util.Scanner;
class complex
{
 int real,img;
 void read()
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter real part: \t");
   real=sc.nextInt();
   System.out.print("Enter imaginary part:\t");
   img=sc.nextInt();
 }
 void display()
 {
  System.out.print(+real+"+"+img+"i");
 }
 void add(complex c1,complex c2)
  {
   real=c1.real+c2.real;
   img=c1.img+c2.img;
   System.out.println("\n\nSum of two complex no.s: " +real+"+"+img+"i");
  }
}
class Q3_complexAdd
{
  public static void main(String args[])
  {
    complex c1=new complex();
    complex c2=new complex();
    complex c3=new complex();
    c1.read();
    System.out.print("\tFirst Complex No :");
    c1.display();

    System.out.println("\n");
    c2.read();
    System.out.print("\tSecond Complex No :");
    c2.display();
    c3.add(c1,c2);
  }
}
