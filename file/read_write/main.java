import java.io.*;

public class main
{
    public static void main(String args[])
    {
        try
        {
            if(false)
            {
                FileWriter pbuf = new FileWriter("test.txt");

                BufferedWriter fp = new BufferedWriter(pbuf);

                fp.write("Test\n");

                fp.close();
                System.out.println("文件创建成功!");
            }
            else
            {

                FileReader pr = new FileReader("test.txt");
                BufferedReader bufr = new BufferedReader(pr);
                String buf;

                int count = 0;
                while((buf = bufr.readLine()) != null)
                {
                    System.out.println("文件读取成功!data[" + count++ + "] =[" + buf + "]");
                }

                bufr.close();

            }
        }
        catch(IOException e)
        {
            System.out.println("IOException!");
        }
    }
}
