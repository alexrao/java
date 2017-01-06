public class main
{
    public static void main(String args[])
    {
        long start_time = System.currentTimeMillis();
        for(int i=0; i<500000; i++)
        {
            String result = "This is" + "test" + "java";
        }
        long end_time = System.currentTimeMillis();
        System.out.println("连接字符使用时间:" + (end_time - start_time) + "ms");

        start_time = System.currentTimeMillis();
        for(int i=0; i<500000; i++)
        {
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("test");
            result.append("java");
        }
        end_time = System.currentTimeMillis();
        System.out.println("StringBuffer连接字符使用时间:" + (end_time - start_time) + "ms");
    }
}
