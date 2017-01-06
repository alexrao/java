import java.util.*;

public class main
{
    public static void main(String args[])
    {
        Object test = new ArrayList();
        displayObjectClass(test);
    }

    public static void displayObjectClass(Object obj)
    {
        if(false)
        {
        if(obj instanceof Vector)
        {
            System.out.println("对象是java.util.Vector 类的实例");
        }
        else if(obj instanceof ArrayList)
        {
            System.out.println("对象是java.util.ArrayList 类的实例");
        }
        }
        else
        {
            System.out.println("对象是" + obj.getClass() + "类的实例");
        }
    }
}
