public class main
{
    public static void main(String args[])
    {
        String str = "This is java";
        System.out.println(remove_char_at(str, 3));
    }

    public static String remove_char_at(String s, int pos)
    {
        return s.substring(0, pos) + s.substring(pos+1);
    }
}
