import java.io.*;
import java.util.Date;

public class main
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("test.txt");
            if(true)
            {
                // 文件写入创建
                FileWriter pbuf = new FileWriter(file);
                BufferedWriter fp = new BufferedWriter(pbuf);
                fp.write("Test0\n");
                fp.close();


                // 文件追加
                pbuf = new FileWriter(file, true);
                fp = new BufferedWriter(pbuf);
                fp.write("TestLine2\n");
                fp.close();

                System.out.println("文件创建成功!");
            }

            if(true)
            {

                // 文件读取
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
                // 文件检测和文件长度
                if(file.exists() && file.isFile())
                {
                    System.out.println("文件长度:" + file.length() + "Bytes");
                }

                // 文件重命名
                File newfile = new File("newtest.txt");
                if(file.renameTo(newfile))
                {
                    System.out.println("[" + file.getName() + "]已重命名文件为[" + newfile.getName() + "]");
                }

                System.out.println("设置权限为只读：" + newfile.setReadOnly()); // 设置文件为只读
                System.out.println("文件是否可写：" + newfile.canWrite());

                if(true)
                {
                    Long time = newfile.lastModified();
                    Date date = new Date(time);
                    System.out.println("文件最后的修改时间:" + date);
                }

                if(false)
                {
                    // 文件删除
                    if(newfile.delete())
                    {
                        System.out.println(newfile.getName() + "文件删除成功");
                    }
                    else
                    {
                        System.out.println(newfile.getName() + "文件删除失败");
                    }
                }
            }

            create_dir_tmp_file();
        }
        catch(IOException e)
        {
            System.out.println("IOException!");
        }
    }

    static void create_dir_tmp_file()
    {
        File file = null;
        File dir = new File("./");

        try
        {
        file = File.createTempFile("test", ".txt", dir);
        System.out.println(file.getPath());
        }
        catch(IOException e)
        {
            System.out.println("IOException!");
        }
    }
}
