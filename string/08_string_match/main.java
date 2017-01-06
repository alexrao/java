public class main
{
    public static void main(String arg[])
    {
        String str1 = "Hello Rxp";
        String str2 = "olleH a rxp";

        boolean match1 = str1.regionMatches(6, str2, 8, 3);
        boolean match2 = str1.regionMatches(true, 6, str2, 8, 3);

        System.out.println("Case ：" + match1);
        System.out.println("Ignore Case ：" + match2);
    }
}
