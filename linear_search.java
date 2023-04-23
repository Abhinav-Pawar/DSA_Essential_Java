//search x in array {-2,5,4,7,9,1} and print its index. If it is not present print -1;
import java.util.Scanner;
public  class linear_search {
    public static void main(String[] args)
    {
        //int[] arr={-2,5,4,7,9,1};
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int flag=0,index=-1;

        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                flag=1;
                index=i;
                break;
            }
        }
        if(flag==0)
            System.out.println("-1");
        else
            System.out.println(index);
    }
}
