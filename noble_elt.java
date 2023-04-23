//In a dataset, if number of elements that are smaller than a given element are equal to the given element, 
//then the given element is a noble element.

public class Noble_elts {
    public static void main(String[] args)
    {
        int[] arr={-10,1,1,2,4,4,4,8,10};   //arr={3,8,4,5,1,-2,0};
        int nobleNos=0;
       
        //1st sort the data in ascending order  --> NlogN
        // then if the index is equal to the value of element, it is a noble element
        int i=0,count=0;
        //write sorting code for arr[] here////////////////////////////////////////
        //Array.sort(arr);
        if(arr[i]==count)
        {
            nobleNos++;
            System.out.println(arr[i]+" is a noble element");
        }
        for(i=1;i<arr.length;i++)
        {
           if(arr[i]!=arr[i-1])
            {
                if(arr[i]==i)
                {
                    nobleNos++;
                    System.out.println(arr[i]+" is a noble element");
                    count=i;        
                }
            }
            else
            {
                if(arr[i]==count)
                {
                    nobleNos++;
                    System.out.println(arr[i]+" is a noble element");
                }
            }
        }


        /*
        for(int i=0;i<arr.length;i++)       //n^2 time complexity
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                    count++;
            }
            if(count==arr[i])
            {
                nobleNos++;
                System.out.println(arr[i]+" is a noble element");
            }
        }
        */
        if(nobleNos==0)
            System.out.println("No noble elements in the given dataset");
        else
            System.out.println("There are "+nobleNos+" Noble elements in the given dataset");
    }
}
