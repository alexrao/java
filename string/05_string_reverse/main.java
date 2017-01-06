public class main
{
    public static void main(String arg[])
    {
        String str = "Hello World";
        //String rev = new StringBuffer(str).reverse().toString();
        StringBuffer strbuf = new StringBuffer(str).reverse();
        String rev = strbuf.toString();

        System.out.println("Preview data:" + str);
        System.out.println("Deal data:" + rev);
    }
}

