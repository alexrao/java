import java.io.*;

public class main
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("test.txt");
            if(true)
            {
                FileWriter pbuf = new FileWriter(file);

                BufferedWriter fp = new BufferedWriter(pbuf);

                fp.write("Test0\n testlinn2\n");

                fp.close();
                System.out.println("文件创建成功!");
            }

            if(true)
            {

                FileReader pr = new FileReader(file);
                BufferedReader bufr = new BufferedReader(pr);
                String buf;

                int count = 0;
                while((buf = bufr.readLine()) != null)
                {
                    System.out.println("文件读取成功!data[" + count++ + "] =[" + buf + "]");
                }

                bufr.close();

            }

            if(true)
            {
                if(file.delete())
                {
                    System.out.println(file.getName() + "文件删除成功");
                }
                else
                {
                    System.out.println(file.getName() + "文件删除失败");
                }
            }
        }
        catch(IOException e)
        {
            System.out.println("IOException!");
        }
    }
}
