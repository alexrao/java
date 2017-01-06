public class main
{
    public static void main(String arg[])
    {
        String str = "Hello rxp";
        int index = str.indexOf("rxp");

        if(index == -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("found :" + index);
        }
    }
}

