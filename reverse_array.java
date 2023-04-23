public class reverse_array
{
    public static void main(String[] args)
    {
        int[] array={2,3,6,1,5,8,12,5};
        int si=0;                   //starting index
        int ei=array.length-1;      //ending index
        while(si<ei)
        {
            int temp=array[si];
            array[si]=array[ei];
            array[ei]=temp;
            si++;
            ei--;
        }
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);

    }
}