/**
 * @Brief    New 字串相比与直接赋值速度更慢
 */
public class main
{
    public static void main(String args[])
    {
        long start_time = System.currentTimeMillis();
        for(int i=0; i<50000; i++)
        {
            String s1 = "hello";
            String s2 = "hello";
        }

        long end_time = System.currentTimeMillis();
        System.out.println("通过String创建字符串: " + (end_time - start_time) + "ms");

        start_time = System.currentTimeMillis();
        for(int i=0; i<50000; i++)
        {
            String s1 = new String("hello");
            String s2 = new String("hello");
        }
        end_time = System.currentTimeMillis();
        System.out.println("通过New String创建字符串: " + (end_time - start_time) + "ms");
    }
}
