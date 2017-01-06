import java.util.*;

public class main
{
    public static void main(String args[])
    {
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA, "%-10.4f%n%n", e);

        System.out.println("====================");
        System.out.format(Locale.JAPAN, "%-10.4f%n%n", e);
    }
}
