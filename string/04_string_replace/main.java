public class main
{
    public static void main(String args[])
    {
        String str = "Hello world";

        System.out.println(str.replace('H', 'W'));      // 0
        System.out.println(str.replace("o", "K"));      // 1  等同于 3
        System.out.println(str.replaceFirst("o", "K")); // 2
        System.out.println(str.replaceAll("o", "K"));   // 3  等同于 1
    }
}
