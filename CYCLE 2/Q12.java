import java.io.*;
class Q12
{
 public static void main(String args[])throws IOException, FileNotFoundException
  {
    int i;
     File f1=new File("C:\\Users\\Miranta\\Desktop\\miranta\\java\\file\\myname.txt");
     File f2=new File("C:\\Users\\Miranta\\Desktop\\miranta\\java\\file\\newone.txt");
     FileInputStream fin=new FileInputStream(f1);
     FileOutputStream fout=new FileOutputStream(f2);
     do
     {
      i=fin.read();
      if (i !=-1)
        fout.write(i);
     }while(i!=-1);
   System.out.println("The entire content of the myname file is copied into the file newone");
    fin.close();
     fout.close();
 }
}