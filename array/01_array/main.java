import java.util.*;

public class main
{
    public static void main(String args[])
    {
        int arr[] = {2, 5, 3, 4, 22, -9, 0, -8, -83, 123, 42};
        Arrays.sort(arr);
        printArray("数组排序后的结果：", arr);

        int index = Arrays.binarySearch(arr, 5);
        System.out.println("元素5在第" + index + "个位置");

        int index_new = -1;
        arr = insert(arr, 1, index_new);
        printArray("添加数据1后的数组：", arr);

        Arrays.sort(arr);
        printArray("数组重新排序后的结果：", arr);
    }

    private static void printArray(String message, int array[])
    {
        System.out.print(message + ": [length:" + array.length + "] :");

        for(int i=0; i<array.length; i++)
        {
            if(i != 0)
            {
                System.out.print(", ");
            }

            System.out.print(array[i]);
        }

        System.out.println();
    }

    private static int[] insert(int org[], int data, int offset)
    {
        System.out.format("len data:%d, insert[%d] to index %d\n", org.length, data, offset);

        int len = org.length;
        int index = offset;
        if(index > len)
            index = len;
        else if(index < 0)
            index = 0;
        System.out.println("offset:" + offset + ", index: " + index);
        int dest[] = new int[len+1];

        System.arraycopy(org, 0, dest, 0, index);
        dest[index] = data;
        System.arraycopy(org, index, dest, index+1, len - index);

        return dest;
    }
}

