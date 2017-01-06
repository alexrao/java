public class StringCompareEmp
{
    public static void main(String args[])
    {
        String str = "Hello World";
        String anotherString = "hello world";
        String str2 = "Hello WorlD";
        Object objStr = str;

        System.out.println(str.compareTo(str2));
        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));  //忽略大小写
        System.out.println(str.compareTo(objStr.toString()));
    }
}
