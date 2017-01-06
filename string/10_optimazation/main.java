public class main
{
    public static void main(String args[])
    {
        String str[] = new String[50000];
        for(int i=0; i<50000; i++)
        {
            str[i] = "s" + i;
        }

        long start_time = System.currentTimeMillis();
        for(int i=0; i<50000; i++)
        {
            str[i] = "hello";
        }
        long end_time = System.currentTimeMillis();
        System.out.println("直接使用字符: " + (end_time - start_time) + "ms");

        start_time = System.currentTimeMillis();
        for(int i=0; i<50000; i++)
        {
            str[i] = new String("hello");
        }
        end_time = System.currentTimeMillis();
        System.out.println("使用New字符: " + (end_time - start_time) + "ms");

        start_time = System.currentTimeMillis();
        for(int i=0; i<50000; i++)
        {
            str[i] = new String("hello");
            str[i] = str[i].intern();
        }
        end_time = System.currentTimeMillis();
        System.out.println("使用New + intern字符: " + (end_time - start_time) + "ms");
    }
}
