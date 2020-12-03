
import java.util.*;  
public class filter {
    public static void main(String args[]) {
    int n=100;
    int[] arr = new int[n];
     Boolean b ;
    for (int i = 2; i <= n; i++) 
    {
            b = true;
            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0) 
                {
                    b = false;
                    break;
                }
            }
            if (b == true) {
                arr[i]=i;
            }
    }
    int[] ar=new int[n];
    for (int i = 0; i < n; i++) 
    {
        int[] p=new int[5];
        if(arr[i]!=0)
        {
            String s=Integer.toString(arr[i]);
            System.out.print(s);
        }

    }
    System.out.print(Arrays.toString(arr));
      }
    
}
