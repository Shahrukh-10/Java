import java.util.Arrays;
public class kanpsack1 
{
    public static void main(String[] args) 
    {
        int[] weight = {40,10,20,24};
        int[] profit = {280,100,120,120};  
        int n = weight.length;
        int[] profitperitem = new int[n];
        float[] x = new float[n];     
        int W=60;
        int w=0;
        for (int i = 0; i < n; i++) 
        {
            profitperitem[i]=(profit[i]/weight[i]);
            x[i]=0;
        }
        int tmp;
        System.out.print(Arrays.toString(profitperitem));
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) 
            {
                if(profitperitem[i]<profitperitem[j])
                {
                    tmp=profitperitem[i];
                    profitperitem[i]=profitperitem[j];
                    profitperitem[j]=tmp;

                    tmp=weight[i];
                    weight[i]=weight[j];
                    weight[j]=tmp;

                    tmp=profit[i];
                    profit[i]=profit[j];
                    profit[j]=tmp;

                }    
            }
        }

        for (int i = 0; i < n; i++) 
        {
            if(weight[i] + w <= W)
            {
                x[i]=1;
                w=w+weight[i];
            }    
            else
            {
                float s=W-w;
                float r =weight[i];
                float z = s/r;
                x[i]=z;
                w=W;
                break;
            }
            
        }
        //System.out.print(Arrays.toString(x));
        float k=0;
        for (int i = 0; i < n; i++) 
        {   
            k = k + x[i]*profit[i];
        }
        System.out.print("Total profit => "+ k);


    }    
}
