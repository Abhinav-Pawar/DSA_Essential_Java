//applicable for some arrangement of data
//reduce the search space --> go to middle
public class binary_search {
    public static void main(String[] args)
    {
        int[] arr={1,3,6,9,13};
        int x=9,flag=0;
        int si=0;
        int ei=arr.length-1;
        int mid=0;
        while(si<=ei)
        {
            mid=(si+ei)/2;
            if(arr[mid]==x)
            {
                flag=1;
                break;
            }
            else if(arr[mid]<x)
                si=mid+1;
            else
                ei=mid-1;
        }
        if(flag==1)
            System.out.println("element found at index "+mid);
        else
            System.out.println("element not found!");
    }
}
