import java.util.*;

public class MinScalarProduct
{
    public static void main(String ar[])
    {
        Scanner scan = new Scanner(System.in);

        int t = Integer.parseInt(scan.nextLine());

        for(int i = 0;i<t;i++)
        {
            int n = Integer.parseInt(scan.nextLine());
            String [] arr1 =  scan.nextLine().split(" ");
            String [] arr2 =  scan.nextLine().split(" ");

            long temp ;

            long [] a_1 = new long[arr1.length];
            long [] a_2 = new long[arr2.length];

            for(int j = 0;j<arr1.length;j++)
            {
                temp = Long.parseLong(arr1[j]);
                a_1[j]= temp;
                temp = Long.parseLong(arr2[j]);
                a_2[j]= temp;
            }

            //long [] a = new long[arr1.length];

            Arrays.sort(a_1);
            Arrays.sort(a_2);
            long b = 0;
            for(int j=0;j<arr2.length;j++)
            {

                b = b +  a_1[j] * a_2[arr2.length-1-j];

            }
            //Arrays.sort(a);

            System.out.println("Case #"+(i+1)+": "+ b);
        }
    }
}