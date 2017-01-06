/**
 * @Brief    查找对应字符最后出现的位置
 */
public class SearchlastString
{
    public static void main(String args[])
    {
        String str_org = "Hello world, Hello Rxp";
        int last_index = str_org.lastIndexOf("Rxp");

        System.out.println("index:" + last_index);
        if(last_index == -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("int the last:" + last_index);
        }
    }
}
