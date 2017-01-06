public class main
{
    public static void main(String arg[])
    {
        String str = "www-rxp-com";
        String tmp[];
        String del = "-";

        tmp = str.split(del);

        for(int i=0; i<tmp.length; i++)
        {
            System.out.println(i + ":" + tmp[i]);
        }

        System.out.println("---------------------------");

        String str1 = "www.rxp.com";
        String tmp1[];
        String del1 = "\\.";

        tmp1 = str1.split(del1);

        for(String x:tmp1)
        {
            System.out.println(x);
        }
    }
}
