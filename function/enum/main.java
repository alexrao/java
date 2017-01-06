enum Car
{
    lamborghini,tata,audi,fiat,honda
}

public class main
{
    public static void main(String args[])
    {
        Car c;
        c = Car.tata;

        switch(c)
        {
            case lamborghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case tata:
                System.out.println("你选择了 tata!");
                break;
            case audi:
                System.out.println("你选择了 audi!");
                break;
            case fiat:
                System.out.println("你选择了 fiat!");
                break;
            case honda:
                System.out.println("你选择了 honda!");
                break;
            default:
                System.out.println("我不知道你的车型。");
                break;
        }

        int data = c.ordinal(); // 枚举转数字
        System.out.println("car.tata = " + data);

        // 通过数字获取枚举
        int value = 2;
        Car val[] =  Car.values();
        System.out.println("car.tata = " + val[value]);

        int sum = 0;

        sum = sumvarargs(new int[]{10, 20, 33});
        System.out.println("Sum = " + sum);

        sum = sumvarargs(10, 20, 33, 20);
        System.out.println("Sum = " + sum);
    }

    static int  sumvarargs(int... intArrays)
    {
        int sum, i;
        sum=0;
        for(i=0; i< intArrays.length; i++)
        {
            sum += intArrays[i];
        }
        return(sum);
    }
}
