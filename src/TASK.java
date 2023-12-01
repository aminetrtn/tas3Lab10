import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TASK {
    public void amine()  {
        int bajt;
   try(
          FileInputStream ril=new FileInputStream("C:\\Users\\MSI\\Desktop\\azerty.txt");
    FileOutputStream fil=new FileOutputStream("C:\\Users\\MSI\\Desktop\\qwerty.txt"))
        {
          do {
           bajt=ril.read();
           if((char)bajt==' ')bajt ='-';
           if(bajt !=-1)fil.write(bajt);

       }while (bajt !=-1);}
   catch (IOException e){ System.out.println("error IO");}
    }
}
