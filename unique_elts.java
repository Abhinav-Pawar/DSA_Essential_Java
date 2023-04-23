//Every element occurs twice except for one. Find the unique element and its index.
//Note: duplicates are adjacent to each other
//Using binary search
public class unique_elts {
    public static void main(String[] args)
    {
        int[] arr={3,3,8,8,2,2,10,10,9,9,5,6,6,11,11};
        int si=0;
        int ei=arr.length;
        int mid=0,flag=0,unique_elt=0;
        while(si<ei)
        {
            mid=(si+ei)/2;
            int first;      //first element of the duplicate pair
            if(arr[mid]==arr[mid+1])
                first=mid;
            else if(arr[mid]==arr[mid-1])
                first=mid-1;
            else        //unique element found (no duplicates on either side)
            {
                flag=1;
                unique_elt=arr[mid];
                break;
            }
                if(first%2==0)                //first element of pair is at even index
                    si=first+1;               //unique element towards right of this
                else                //first element of pair is at odd index
                    ei=first;       //unique element towards left of this
        }
        if(flag==1)
            System.out.println("Unique element is "+unique_elt+" found at index "+mid);
        else
            System.out.println("Unique element not found!");
    }
}


/*
 * while(si<ei)
        {
            mid=(si+ei)/2;
//            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])

            if(arr[mid]==arr[mid+1])
            {
                if(mid%2==0)                //first element of pair is at even index
                    si=mid+1;               //unique element towards right of this
                else                //starting index of duplicate pair is odd
                    ei=mid;       //unique element towards left of this
            }
            else if(arr[mid]==arr[mid-1])
            {
                if(mid%2==0)                //ending index of duplicate pair is even
                    ei=mid-1;               //unique element towards left of this
                else                 //ending index of duplicate pair is odd
                    si=mid;       //unique element towards right of this
            }
            else        //unique element found (no duplicates on either side)
            {
                flag=1;
                index=mid;
                unique_elt=arr[mid];
                break;
            }
        }
 */